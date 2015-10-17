public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board==null || board.length==0 || board[0].length==0)
        	return false;

        if(word==null || word.length()==0) return false;

        for(int i=0; i<board.length; i++){//i = row
        	for(int j=0; j<board[0].length; j++){//j=col
        		boolean[][] isVisited = new boolean[board.length][board[0].length];

    			if(searchChar(board, isVisited, word, 0, i, j)){
    				return true;
    			}
        	}//for
        }//for

        return false;
    }

    private boolean searchChar(char[][] b, boolean[][] iv, String w, int index, int r, int c){
    	if(index>=w.length()) return true;

    	if(r<0 || r>=b.length || c<0 || c>=b[0].length) return false;

    	if(iv[r][c]) return false;

    	if(w.charAt(index)==b[r][c]){
    		iv[r][c]=true;
    		if(searchChar(b,iv,w,index+1,r+1,c) || searchChar(b,iv,w,index+1,r-1,c) || searchChar(b,iv,w,index+1,r,c-1) || searchChar(b,iv,w,index+1,r,c+1)){
    		    return true;
    		}
    		
    		iv[r][c]=false;
    		return false;
    	}else{
    		return false;
    	}
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    public void test1(){
    	char[][] b = {{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		String s = "ABCESEEEFS";
		System.out.println(exist(b, s));
    }
}