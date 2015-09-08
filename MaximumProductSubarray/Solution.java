public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}

	//tle solution
    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int max = nums[0]; 

        for(int i=0; i<nums.length; i++){
        	int prod = nums[i];
        	for(int j=i+1; j<nums.length; j++){
        		prod*=nums[j];

        		if(prod>max) max=prod;
        	}
        }

        return max;
    }

    public void test1(){
    	int[] a = {2,3,-2,4};
    	System.out.println(maxProduct(a));
    }
}