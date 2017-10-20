public class exceptionExample3{

	public void m1(){
		System.out.println("m1:print this line");
		//int x = 5/0;
		throw new Exception("Hello exception from m1()");
	}

	public void m2(){
		try{
			m1();			
		}
		catch(Exception e){
			System.out.println("m2:"+e.getMessage());
		}
		System.out.println("m2: resumes here");
		m1();
	}

	public static void main(String[] args){

		exceptionExample3 obj = new exceptionExample3();
		try{
			obj.m2();
		}
		catch (Exception e){
			System.out.println("main : "+e.getMessage());
		}
		System.out.println("main: resumes here");
		//obj.m2();
		System.out.println("main: do not print this line");

	}
	
}
		