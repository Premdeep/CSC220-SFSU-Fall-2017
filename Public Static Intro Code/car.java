public class car{
	// Everything in this class is static
	// so we dont need to instantiate it. 
	private static String color = "green";

	public static void changeColor(String newColor){
		color = newColor;		
	}

	public static void printColor(){
		System.out.println("color is : "+color);
	}


	public static void main(String[] arg){

		// Calling a static method of a different class.
		//helloWorld.notmain();

		printColor();
		changeColor("red");
		printColor();
	}
}
		