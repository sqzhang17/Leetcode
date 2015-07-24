public class Solution__selection_sort{
	public static void main(String[] args){
		int[] a = {15,3,2,6,3,9};
		
		Solution__selection_sort s = new Solution__selection_sort();

		s.doSelectionSort(a);

		for(int i:a){
			System.out.print(i+", ");
		}
	}

	public void doSelectionSort(int[] arr){
		/* initial
		for(int x=0; x<arr.length; x++){
			int index_of_min = x;

			for(int y=x; y<arr.length;y++){
				if(arr[index_of_min]>arr[x]){
					y=index_of_min;
				}

				int temp = arr[x];
				arr[x] = arr[index_of_min];
				arr[index_of_min] = temp;
			}
		}
		*/
		for(int x=0; x<arr.length; x++){
			int index_of_min = x;

			for(int y=x+1; y<arr.length;y++){//change
				if(arr[index_of_min]>arr[y]){//change
					index_of_min=y;
				}
			}//change

			int temp = arr[x];
			arr[x] = arr[index_of_min];
			arr[index_of_min] = temp;

			//change}
		}

	}
}