public class Solution {
	public void nextPermutation(int[] num) {
	    int n=num.length;
	    if(n<2) return;

	    //locate the reversely sorted stopped point
	    int index=n-1;        
	    while(index>0){
	        if(num[index-1]<num[index])
	            break;
	        index--;
	    }

	    //not totally reversely sorted
	    if(index!=0){
	        int val=num[index-1];
	        int j=n-1;

	        //find the first element larger than num[index]
	        while(j>=index){
	            if(num[j]>val)
	                break;
	            j--;
	        }

	        //swap elements
	        swap(num,j,index-1);

	        //reverse the second half
	        reverseSort(num,index,n-1);

	        return;
	    }

	    //if totally reversely sorted, reverse the entire array
	    reverseSort(num,0,n-1);
	}

	public void swap(int[] num, int i, int j){
	    int temp=0;
	    temp=num[i];
	    num[i]=num[j];
	    num[j]=temp;
	}

	public void reverseSort(int[] num, int start, int end){   
	    if(start>end)
	        return;
	    for(int i=start;i<=(end+start)/2;i++)
	        swap(num,i,start+end-i);
	}
}