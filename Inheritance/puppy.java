public class puppy extends dog{

	public puppy(){
		super(4);
		System.out.println("in puppy constructor");
	}

	public void name(){
		System.out.println("Krypto super puppy");
	}

	public void run(){
		System.out.println("puppy is running");
	}
	public static void main(String[] args){
		// puppy p = new puppy();
		// p.run();

		dog d = new puppy();
		d.name();
	}
}
		