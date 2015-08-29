public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();

		s.test1();
		s.test2();
	}

    public int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];

        leftProd[0] = nums[0];
        for(int i=1;i<nums.length;i++){
        	leftProd[i]=leftProd[i-1]*nums[i];
        }

        int rightProd =1;

        for(int i=nums.length-1;i>0;i--){
        	leftProd[i]=leftProd[i-1]*rightProd;
        	rightProd *=nums[i];
        }

        leftProd[0]=rightProd;

        return leftProd;
    }

    public void test1(){
    	int[] b = {1,2,3,4};
    	int[] a = productExceptSelf(b);

    	for(int i:a){
    		System.out.print(i+",");
    	}
    	System.out.println();
    }

    public void test2(){
    	int[] b = {1,2};
    	int[] a = productExceptSelf(b);

    	for(int i:a){
    		System.out.print(i+",");
    	}
    	System.out.println();
    }
}