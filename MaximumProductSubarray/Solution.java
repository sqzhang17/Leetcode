public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
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

    public int maxProduct_v2(int[] nums){
    	if(nums==null || nums.length==0) return 0;

    	int maxUntilCurr = nums[0];
    	int minUntilCurr = nums[0];
    	int maxCurr=0;
    	int minCurr=0;
    	int maxSoFar=nums[0];

    	for(int i=1;i<nums.length;i++){
    		maxCurr = Math.max(Math.max(maxUntilCurr*nums[i], minUntilCurr*nums[i]), nums[i]);
    		minCurr = Math.min(Math.min(minUntilCurr*nums[i], maxUntilCurr*nums[i]), nums[i]);

    		if(maxCurr>maxSoFar) maxSoFar=maxCurr;

    		maxUntilCurr=maxCurr;
    		minUntilCurr=minCurr;
    	}

    	return maxSoFar;
    }

    public void test1(){
    	int[] a = {2,3,-2,4};
    	System.out.println(maxProduct(a));
    }

    public void test2(){
    	int[] a = {2,3,-2,4};
    	System.out.println(maxProduct_v2(a));
    }
}