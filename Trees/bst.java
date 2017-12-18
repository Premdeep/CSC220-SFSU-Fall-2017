class bst{

	public Node root;
	public bst(){
		root = null;
	}

	public void insertNode(int val){
		Node newNode = new Node(val);
		if(root == null){
			root = newNode;
			return;
		}

		Node current = root;
		Node prev = null;

		while(true){
			prev = current;
			if(val <= current.data){
				 current = current.left;
				 if(current == null){
				 	prev.left = newNode;
				 	return;
				 }
			}else{
				current = current.right;
				if(current == null){
					prev.right = newNode;
					return;
				}
			}
		}

	}

	public boolean search(Node root, int item){
		if(root == null)
			return false;
		if(item == root.data)
			return true;
		if(item < root.data){
			return search(root.left, item);
		}else{
			return search(root.right, item);
		}
	}

	public void inOrder(Node root){
		if(root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);

	}

	public static int max(int a, int b){
		if(a > b)
			return a;
		return b;
	}

	public int height(Node root){
		if(root == null)
			return -1;
		return 1+max(height(root.left), height(root.right));
	}

	public Node getParentNode(Node current){
		int val = current.data;
		Node prev = null;
		Node walk = root;
		while(walk != current && walk != null){
			prev = walk;
			if(val > walk.data)
				walk = walk.right;
			else if(val < walk.data)
				walk = walk.left;
			else;


		}

		return prev;


	}

	public Node getMaxNode(Node current){
		while(current.right != null)
			current = current.right;
		return current;
	}

	public void deleteNode(Node root, int val){
			if(root == null)
				return;
			if(val > root.data)
				deleteNode(root.right, val);
			else if(val  < root.data)
				deleteNode(root.left, val);
			else{
				// Found it
				if(root.left == null && root.right == null){
					Node parent = getParentNode(root);
					if(parent.left.data == root.data)
						parent.left = null;
					else
						parent.right = null;
				}
				else if(root.left == null){
					Node parent = getParentNode(root);
					if(parent.left.data == root.data){
						parent.left = root.right;
					}
					if(parent.right.data == root.data)
						parent.right = root.right;

				}
				else if(root.right == null){
					Node parent = getParentNode(root);
					if(parent.left.data == root.data)
						parent.left = root.left;
					if(parent.right.data == root.data)
						parent.right = root.left;

				}else{

					Node maxNode = getMaxNode(root.left);
					root.data = maxNode.data;
					deleteNode(root.left, maxNode.data);
					
				}

			}
	}

	public static void main(String[] args) {
		
		bst tree = new bst();
		tree.insertNode(5);
		tree.insertNode(4);
		tree.insertNode(1);
		tree.insertNode(3);
		tree.insertNode(2);

		System.out.println("inOrder: ");
		tree.inOrder(tree.root);
		System.out.println("search : 9 "+tree.search(tree.root, 9));
		System.out.println("search : 2 "+tree.search(tree.root, 2));
		System.out.println("height : "+tree.height(tree.root));


	}
}










