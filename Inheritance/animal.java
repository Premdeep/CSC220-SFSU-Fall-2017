public class animal{

	public int age;
	public double weight;

	public animal(int age){
		this.age = age;
		weight = 10.5;
		System.out.println("in animal constructor");
	}

	public  void run(){
		System.out.println("animal is running");
	}

	public void eat(){
		System.out.println("animal is eating");
	}

	
}
		