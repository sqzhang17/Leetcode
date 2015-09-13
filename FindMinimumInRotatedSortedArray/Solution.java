public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test();
	}
    public int findMin(int[] nums) {
        if(nums==null || nums.length==0) return 0;

        int l=0;
        int r=nums.length-1;

        while(l<=r){
        	int m = (l+r)/2;

        	if(nums[l]<nums[r]){
        		return nums[l];
        	}else{//nums[l]>nums[r]
        		if(nums[m]<nums[r]){
        			r=m; //NOT r=m-1; -> m still can be the min 
        		}else if(nums[m]>nums[l]){
        			l=m; //NOT l=m+1; -> m still can be the min
        		}else{
        			return nums[r];
        		}
        	}
        }

        return nums[l];
    }

    public void test(){
    	int[] a = {4, 5, 6, 7, 0, 1, 2};
    	System.out.println(findMin(a));
    }
}