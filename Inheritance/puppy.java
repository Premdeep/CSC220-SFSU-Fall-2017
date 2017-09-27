public class puppy extends dog{

	public puppy(){
		super();
		//System.out.println("in puppy constructor");
	}

	public void name(){
		System.out.println("Krypto super puppy");
	}

	public void run(){
		System.out.println("puppy is running");
	}
	public static void main(String[] args){
		// puppy p = new puppy();
		//  p.run();

		animal a = new animal();
		dog d = new dog();
		puppy p = new puppy();
		cat c  = new cat();

		animal a1 = new dog();
		a1.run();

		animal a2 = new puppy();
		a2.run();

		animal a3 = new cat();
		a3.run();

		dog d1 = (dog) a1;
		d1.run();

		dog d2 = (dog) a;



		
	}
}
		