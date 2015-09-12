public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();

	}
    public int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int globalMax=nums[0];
        int localMax =nums[0];

        for(int i=1;i<nums.length;i++){
			localMax =Math.max(nums[i],localMax+nums[i]);
        	globalMax=Math.max(globalMax,localMax);
        }

        return globalMax;
    }

    public void test1(){
    	int[] a ={-2,1,-3,4,-1,2,1,-5,4};
    	System.out.println(maxSubArray(a));
    }
    public void test2(){
    	int[] a ={1};
    	System.out.println(maxSubArray(a));

    }
}