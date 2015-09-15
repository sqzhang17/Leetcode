public class Solution {
    public boolean search(int[] nums, int target) {
        if(nums==null || nums.length<1) return false;

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
        	int mid = (left+right)/2;

        	if (nums[mid] == target) // case 0
            return true;
	        // finally start == mid == end, if case 0, return true, else end the loop
	        else if (nums[left] == nums[mid])
	            left=mid+1;
	        else if (nums[right] == nums[mid])
	            right=mid-1;
	        else if (nums[left] <= target && target <= nums[mid]) // case 1
	            right = mid;
	        else if (nums[mid] < target && target <= nums[right]) // case 2
	            left = mid + 1;
	        else if (nums[left] > nums[mid]) // case 2 is false, so target in this range
	            right = mid;
	        else   // case A[mid] > A[right] and case 1 is false, similar to above
	            left = mid + 1;
	    }
	        return false;
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    public void test1(){
    	int[] a={3,4,5,1,2};
    	int target = 2;
    	System.out.println(search(a,target));
    }
}