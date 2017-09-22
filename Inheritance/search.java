public class search{

	public static boolean lSearch(int[] a, int size, int item){
			int count = 0;
		for(int i = 0; i < size; i++){
			count++;
			if(a[i] == item){
				System.out.println("count in Linear search :"+count);
				return true;
			}
		}
		System.out.println("count in Linear search :"+count);
		return false;
	}

	public static boolean bSearch(int[] a, int si, int ei, int item){
		int count = 0;
		while(ei-si >= 0){
			count++;

			int mi = si + (ei-si)/2;
			if(a[mi] == item){
				System.out.println("count in bSearch : "+count);
				return true;
			}
			else if(a[mi] > item){
				ei = mi-1;
			}else{
				si = mi+1;
			}
		}
		System.out.println("count in bSearch : "+count);
		return false;

	}

	public static void main(String[] args){

		int[] a = {5, 4, 1, 3, 2, 9, 7, 8, 6};
		int[] b = {1,2,3,4,5,6,7,8,9};
		System.out.println(lSearch(a, 9, 10));
		System.out.println(bSearch(b, 0, 8, 10 ));

	}
}
		