public class Solution{
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();

		s.test2();
	}

	public void test1(){
		int[][] b = {{1,2,3}, {4,5,6}};
		System.out.println("before rotate:");
		printMatrix(b);

 		int[][] a = rotateMatrix(b, 1);
 		System.out.println("after rotate:");
 		printMatrix(a);
	}

	public void test2(){
		int[][] b = {{1,2,3}, {4,5,6}};
		System.out.println("before rotate:");
		printMatrix(b);

 		int[][] a = rotateMatrix(b, 3);
 		System.out.println("after rotate:");
 		printMatrix(a);
	}

	public void printMatrix(int[][] m){
		for(int[] i:m){
			for(int j:i){
				System.out.print(j+", ");
			}
			System.out.println();
		}
	}

	public int[][] rotateMatrix(int[][] matrix, int rotateTime){
		if(matrix==null) return null;

		if(rotateTime==0) return matrix;

		int[][] res = new int[matrix[0].length][matrix.length];
		for(int k=0;k<rotateTime; k++){
			for(int i=0; i<matrix.length; i++){
				for(int j=0; j<matrix[i].length; j++){
					res[j][matrix.length-i-1] = matrix[i][j];
				}
			}
		}

		return rotateMatrix(res, rotateTime-1);
	}

}