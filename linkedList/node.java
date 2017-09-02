public class node{

	public int data;
	public node next;

	public node(){
		data = 0;
		next = null;
	}

	public node(int data){
		this.data =data;
		this.next = null;

	}

	public static void printList(node start){

			if(start == null)
				return;
			node walk = start;
			while(walk != null){
				System.out.print(walk.next+" -> ");
				walk = walk.next;
			}
			System.out.print("null\n");

	}

	public static void main(String[] args){

			node a = new node(5);
			node b = new node(7);
			node c = new node(17);

			a.next = b;
			b.next = c;
			c.next = null;

			printList(a);


	}
}
		