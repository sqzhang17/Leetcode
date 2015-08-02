public class Solution {
	public static void main(String[] args){
		int[][] a ={{1,3,5,7},{10,11,16,20},{23,30,34,50}};

		System.out.println(searchMatrix(a,3));

	}
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(matrix==null || matrix.length ==0 || matrix[0].length==0) 
            return false;
        int start = 0, end = matrix.length*matrix[0].length-1;
        
        while(start<=end){
            int mid=(start+end)/2, midX=mid/matrix[0].length,
                midY=mid%matrix[0].length;
            if(matrix[midX][midY]==target) return true;
            if(matrix[midX][midY]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
}