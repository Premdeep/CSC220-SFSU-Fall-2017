public class linkedList{

	 public node head;
	 public int size;

	 public linkedList(){
	 		head = null;
	 		size = 0;
	 }

	 public void appendNode(int data){

	 	node newNode = new node(data);
	 	if(head == null)
	 		head = newNode;
	 	else{
	 		node last = head;
	 		while(last.next != null)
	 			last = last.next;
	 		last.next = newNode;
	 	}
	 	
	 	++size;
	 	
	 }

	 public void insertFront(int data){
	 	node newNode = new node(data);
	 	newNode.next = head;
	 	head = newNode;
	 	++size;
	 }

	 public void printList(){
	 	if(head == null)
	 		return;
	 	node walk = head;
	 	while(walk != null){
	 		System.out.print(walk.data+" -> ");
	 		walk = walk.next;
	 	}
	 	System.out.println("null");
	 }

	 public void size(){
	 	System.out.println("Size is : "+size);
	 }

	 public void removelast(){
	 	if(isEmpty())
	 		return;
	 	if(head.next == null){
	 		head = null;
	 		return;
	 	}

	 	node last = head;
	 	node prev = head;
	 	while(last.next != null){
	 		prev = last;
	 		last = last.next;	 	
		 }
		 prev.next = null;
		 --size;

	 }

	 public boolean isEmpty(){
	 	return (size == 0);
	 }

	 public void removeFront(){
	 	if(isEmpty())
	 		return;
	 	head = head.next;
	 	--size;
	 }

	 public void deleteIndex(int i ){

	 	if(isEmpty())
	 		return;

	 	if(i >= size){
	 		System.out.println("Index out of bound error");
	 		return;
	 	}

	 	if(i == 0){
	 		head = head.next;
	 		--size;
	 		return;
	 	}

	 	node prev = null;
	 	node curr = head;

	 	while(i != 0){
	 		prev = curr;
	 		curr = curr.next;
	 		i--;
	 	}

	 	prev.next = curr.next;
	 	--size;
	 }



	public static void main(String[] args){

		linkedList l = new linkedList();
		//l.size();
		l.appendNode(1);
		l.appendNode(2);
		l.appendNode(3);
		//l.printList();
		//l.size();
		l.insertFront(4);
		l.insertFront(5);
		//l.printList();
		//l.size();
		//l.removelast();
		//l.removelast();
		//l.printList();
		//l.size();
		//l.removeFront();
		l.printList();
		l.size();
		l.deleteIndex(1);
		l.printList();
		l.size();

	}
}
		