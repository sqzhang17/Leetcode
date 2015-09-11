public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0) return 0;

        int right=nums.length-1;
        int left =0;
        int mid =0;

        while(right>=left){
        	mid=(right+left)/2;

        	if(nums[mid]==target){
        		return mid;
        	}else if(nums[mid]>target){
        		right=mid-1;
        	}else{//nums[mid]<target
        		left=mid+1;
        	}
        }

        return left;
    }

    public void test1(){
    	int[] a= {1,3,5,6};
    	System.out.println(searchInsert(a,5));
    	System.out.println(searchInsert(a,2));
    	System.out.println(searchInsert(a,7));
    	System.out.println(searchInsert(a,0));
    }
}