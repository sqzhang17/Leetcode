public class Solution {
	public static void main(String[] args){
		int[][] a={{1,2},{3,4}};

		for(int i=0; i<2; i++){
			for(int j=0; j<2;j++){
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}

		rotate_inplace(a);

		for(int i=0; i<2; i++){
			for(int j=0; j<2;j++){
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}

	}// end main

    public static void rotate(int[][] matrix) {
        if(matrix==null) return;

        int len=matrix.length;

        int[][] res = new int[len][len];

        for(int i=0; i<len; i++){
        	for(int j=0; j<len; j++){
        		res[i][j]=matrix[len-j-1][i];
        	}
        }// end out for loop

        for(int i=0; i<len; i++){
        	for(int j=0; j<len; j++){
        		matrix[i][j]=res[i][j];
        	}
        }//end for loop
    }// end rotate

    public static void rotate_inplace(int[][] matrix){
    	if(matrix==null) return;

    	int l=matrix.length;

    	for(int i=0; i<l/2; i++){
    		for(int j=0; j<Math.ceil((double)l/2);j++){
    			int temp = matrix[i][j];
    			matrix[i][j]=matrix[l-j-1][i];
    			matrix[l-j-1][i]=matrix[l-i-1][l-j-1];
    			matrix[l-i-1][l-j-1]=matrix[j][l-i-1];
    			matrix[j][l-i-1]=temp;
    		}
    	}// end for loop
    }
}