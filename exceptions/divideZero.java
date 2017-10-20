public class divideZero{
	public static void division(int total, int n){
		System.out.println("Computing division");
		try{
			int avg = total/n;
			System.out.println("avg : "+avg);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("end of division method");
		}
		
		
	}

	public static void main(String[] args){

		division(100, 4);
		division(1000, 0);
		System.out.println("End of Program");

	}
}
		