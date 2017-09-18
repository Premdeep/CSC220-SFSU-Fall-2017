public class sort{{}

	public static void print(int[] a, int size){
		for(int i = 0; i < size; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void swap(int[] a, int c, int b){
		int temp = a[c];
		a[c] = a[b];
		a[b] = temp;
	}

	public static void sSort(int[] a, int size){
		for(int i = 0; i < size-1; i++){
			for(int j = i+1; j < size; j++){
				if(a[i] > a[j])
					swap(a, i, j);
			}
		}
	}

	public static void main(String[] args){

		int[] a  = {5,4,1,3,2};
		print(a,5);
		sSort(a, 5);
		print(a,5);

	}
}
		