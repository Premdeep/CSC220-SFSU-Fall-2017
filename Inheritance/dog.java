public class dog extends animal{

	public dog(){
		super(2);
	}

	public void run(){
		System.out.println("Dog is running");
	}

	public static void main(String[] args){
		dog d = new dog();
		d.run();
		System.out.println("age of dog :"+d.age);
	}
}
		