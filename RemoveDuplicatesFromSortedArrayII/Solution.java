public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        if(nums.length<=2) return nums.length;

        int ptr=2;
        for(int i=2; i<nums.length; i++){
        	if(nums[i]>nums[ptr-2]){
        		nums[ptr]=nums[i];
        		ptr++;
        	}
        }

        return ptr;
    }
}