public class linkedList{

	 public node head;
	 public int size;

	 public linkedList(){
	 		head = null;
	 		size = 0;
	 }

 	public void appendNode(int data){

	 	node n = new node(data);
	 	if(head == null){
	 		head = n;
	 		++size;
	 		return;
		 }
		 else{
		 	node last = head;
		 	while(last.next != null)
		 		last = last.next;
		 	last.next = n;
		 	++size;

		 }
	 	}

	 	public boolean isEmpty(){
	 		return (size == 0);
	 	}


	public void printList(){
		// if(head == null)
		// 	return;
		if(isEmpty())
			return;

		node walk = head;

		while(walk != null){
			System.out.print(walk.data+" -> ");
			walk = walk.next;
		}
		System.out.println("null");

	}

	public void listSize(){
		System.out.println("Size is : "+size);
	}

	public void insertFront(int data){
		node first = new node(data);
		first.next = head;
		head = first;
		++size;
	}

	public void removeFront(){
		if(isEmpty())
			return;
		head = head.next;
		--size;
	}



	public static void main(String[] args){

		linkedList l = new linkedList();
		l.listSize();

		l.appendNode(2);
		l.appendNode(1);
		l.appendNode(5);	

		l.insertFront(4);
		l.insertFront(9);
		l.printList();
		l.listSize();

		l.removeFront();
		l.removeFront();

		l.printList();
		l.listSize();

	}
}
		