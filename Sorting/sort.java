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

	public static void iSort(int[] a, int size){

		for(int unsorted = 1; unsorted < size; unsorted++){
			for(int sorted  = 0; sorted < unsorted; sorted++){

				if(a[sorted] > a[unsorted])
					swap(a, sorted, unsorted);
			}
		}
	}

	public bSort(int[] a , int size){
		boolean swapped = true;
		while(swapped){
			swapped = false;
			for(int i = 0; i < size; i++){
				if(a[i] > a[i+1]){
					swap(a, i , i+1);
					swapped = true;
				}
			}
		}
	}
	

	
	
	

	public static void main(String[] args){

		int[] a  = {5,4,1,3,2};
		int[] b = {1,2,3,4,5,6,7,8,9};

		print(a,5);
		iSort(a, 5);
		print(a,5);

		

	}
}
		