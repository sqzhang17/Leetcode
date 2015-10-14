public class Maze{
	public static void main(String[] args){
		Maze m = new Maze();
		m.test1();
	}
	public int search(int[][] maze){
		boolean[][] v = new boolean[maze.length][maze[0].length];
		if(helper(maze, v, 0,0)){
			return 1;
		}

		return 0;

	}

	public boolean  helper(int[][] a, boolean[][] visited, int r, int c){
		if(r<0 || r>=a.length || c<0 || c>=a[0].length || visited[r][c]) return false;

		visited[r][c]=true;

		if(a[r][c]==9) {
			return true;
		}else if(a[r][c]==1){
			return false;
		}else{
			return helper(a, visited, r-1,c) || helper(a, visited, r+1,c) || helper(a, visited, r,c-1) ||helper(a, visited, r,c+1);
		}

	}

	public void test1(){
		int[][] a = {{0,0,0},{1,0,1},{1,1,9}};
		System.out.println(search(a));
	}

}