public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();

	}

    public int numIslands(char[][] grid) {
    	if(grid==null || grid.length==0 || grid[0].length==0) return 0;

    	int count=0;

    	for(int i=0; i<grid.length; i++){
    		for(int j=0; j<grid[0].length; j++){
    			if(grid[i][j]=='1'){
    				count++;
    				explore(grid,i,j);
    			}
    		}
    	}

    	return count;
        
    }

    private void explore(char[][] grid, int i, int j){
    	if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1) return;

    	//if visited
    	if(grid[i][j]!='1') return;

    	grid[i][j]='2';

    	explore(grid,i-1,j);
    	explore(grid,i+1,j);
    	explore(grid,i,j-1);
    	explore(grid,i,j+1);
    }

    public void test1(){
    	char[][] grid ={{'1','0','0','0'},{'0','0','0','0'},{'0','0','0','0'},{'0','0','0','0'}};
    	System.out.println(numIslands(grid));
    }
}