public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        
        int lo = 0;
        int hi = nums.length-1;
        
        while(hi>lo){
            if(nums[hi]>nums[lo]) return nums[lo];
            
            int mid = (hi+lo)/2;
            
            if(nums[mid]>=nums[lo]){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        
        return nums[lo];
    }
}