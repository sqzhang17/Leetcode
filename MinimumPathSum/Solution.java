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
}