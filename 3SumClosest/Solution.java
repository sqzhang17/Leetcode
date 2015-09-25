public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length==0) return 0;

        Arrays.sort(nums);

        //global min
        int gmin = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
        	int lo=i+1;
        	int hi=nums.length-1;
        	while(lo<hi){
        		//current sum
        		int csum = nums[i]+nums[lo]+nums[hi];

        		//meet smallest, 0, return directly
        		if(csum-target==0) return csum;

        		//update global min
        		if(Math.abs(csum-target)<Math.abs(gmin-target)){
        			gmin = csum;
        		}

        		//update hi and lo pointer
        		if(csum>target){
        			hi--;
        		}else{
        			lo++;
        		}
        	}
        }

        return gmin;
    }
}