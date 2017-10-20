public class linkedStack<T> implements stackInterface<T>{

	private  node<T> head;
	//private int size;

	public linkedStack(){
		head = null;

	}

	

	public void push(T item){
		node<T> newNode = new node<T>(item);
		newNode.next = head;
		head = newNode;
		
	}

	public T peek(){
		if(head == null)
			return null;
		return head.data;

	}

	public T pop(){

		if(head == null)
			return null;
		node<T> temp = head;
		head = head.next;
		
		return temp.data;
		

	}

	public boolean isEmpty(){
		return head == null;
	}

	public void clear(){
		head = null;
		
	}

	public static void main(String[] args){

		stackInterface<String> st = new linkedStack<String>();
		st.push("prem");		
		st.push("ram");		
		st.push("max");
		
		while(!st.isEmpty()){
			System.out.println(st.peek());
			st.pop();
		}
		

	}
}
