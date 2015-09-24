public class Solution {
    public int rob(int[] nums) {
              if(nums==null || nums.length==0) return 0;
        if(nums.length ==1) return nums[0];
        if(nums.length ==2) return Math.max(nums[0], nums[1]);

        //case 1: nums[0] not taken
        int globalMax=Integer.MIN_VALUE;
        int prevMax=0;
        int prevPrevMax=0;
        int currMax=0;
        for(int i=1;i<nums.length;i++){
        	currMax=Math.max(nums[i]+prevPrevMax, prevMax);
        	globalMax=Math.max(globalMax, currMax);
        	prevPrevMax = prevMax;
        	prevMax = currMax;
        }

        //case 2: nums[0] is taken
        prevMax=nums[0];
        prevPrevMax=0;
        currMax=0;
        for(int i=1;i<nums.length-1;i++){
        	currMax=Math.max(nums[i]+prevPrevMax, prevMax);
        	globalMax=Math.max(globalMax, currMax);
        	prevPrevMax = prevMax;
        	prevMax = currMax;
        }

        //compare the globle max 
        return globalMax;  
    }
}