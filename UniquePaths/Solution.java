public class Solution {
    public int uniquePaths(int m, int n) {
        if(m<=1 || n<=1) return 1;

        int[] temp = new int[n-1];

        //initilize temp array for the first row
        for(int i=0;i<n-1;i++){
        	temp[i]=1;
        }

        //loop the matrix, except the first row and first column
        for(int i=0; i<m-1; i++){
        	//keep track of the left element 
        	int left=1;

        	for(int j=0; j<n-1; j++){
        		left+=temp[j];
        		temp[j]=left;
        	}
        }

        return temp[n-2];
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    private void test1(){
    	System.out.println(uniquePaths(2,2));
    }
}