/*
key point:
	1.	the first row and first column can be calculated directly,
		since there is only one direction to reach that element.
	2.	traverse each elemetn besides first row and first column,
		update that element by comparing the up and left element

@author: Shiqi Zhang
*/

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;

        //calculte first row
        for(int i=1;i<grid[0].length;i++){
        	grid[0][i]+=grid[0][i-1];
        }

        //calculate first column
        for(int i=1; i<grid.length;i++){
        	grid[i][0]+=grid[i-1][0];
        }

        //traverse each element in the matrix
        for(int i=1; i<grid.length;i++){
        	for(int j=1; j<grid[0].length;j++){
        		//update the element
        		grid[i][j]=Math.min(grid[i][j-1], grid[i-1][j])+grid[i][j];
        	}
        }

        return grid[grid.length-1][grid[0].length-1];
    }

    public void test1(){
    	int[][] a ={{1,2},{3,4}};

    	System.out.println(minPathSum(a));
    }
/*
Key point:
	1.	DP within the loop
	2.	consider all the case within the loop
*/
    public int minPathSum_v2(int[][] grid) {
		int m = grid.length;// row
	    int n = grid[0].length; // column
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (i == 0 && j != 0) {
	                grid[i][j] = grid[i][j] + grid[i][j - 1];
	            } else if (i != 0 && j == 0) {
	                grid[i][j] = grid[i][j] + grid[i - 1][j];
	            } else if (i == 0 && j == 0) {
	                grid[i][j] = grid[i][j];
	            } else {
	                grid[i][j] = Math.min(grid[i][j - 1], grid[i - 1][j])
	                        + grid[i][j];
	            }
	        }
	    }

	    return grid[m - 1][n - 1];
	}
}