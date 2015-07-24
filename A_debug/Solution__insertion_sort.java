public class Solution__insertion_sort{
    public static void main(String[] args){
        int[] a = {15,3,2,6,3,9};
        
        Solution__insertion_sort s = new Solution__insertion_sort();

        s.doInsertionSort(a);

        for(int i:a){
            System.out.print(i+", ");
        }
    }

    public void doInsertionSort(int[] arr){
       for(int i=1; i<arr.length;i++){
            int valueToSort = arr[i];
            /* version 1 
            int j=i-1;

            while(j>=0 && arr[j]>valueToSort){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=valueToSort;
            */

            //version2
             int j=i;

             while(j>0 && arr[j-1]>valueToSort){
                arr[j]=arr[j-1];
                j--;
             }   

             arr[j] = valueToSort;
            
       }
    }
}