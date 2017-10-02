public class stupid{

	public static void stu(int n){
		if(n <= 1){
			System.out.println(n);
			return;
		}
		stu(n-1);
		stu(n-2);
		stu(n-3);
	}

	public static int fib(int n){
			if(n <=2 )
				return 1;
			int first = 1;
			int second = 1;
			int next = 0;
			for(int  i = 3; i <= n; i++){
				next = first+second;
				first = second;
				second = next;
			}
			return next;
	}

	public static int fibrec(int n){
		if(n <= 2)
			return 1;
		return fibrec(n-1)+fibrec(n-2);
	}

	public static void main(String[] args){
		//stu(5);
		System.out.println(fib(6));
		System.out.println(fibrec(6));
	}

}
		