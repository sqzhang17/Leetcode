import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}

	private List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> threeSum(int[] nums) {
    	
        if(nums==null || nums.length<3) return res;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
        	findTarget(nums, 0-nums[i], i, i+1, nums.length-1);
        } 

        return res;
    }

    private void findTarget(int[] arr, int target, int currPos, int left, int right){
    	if(left>=right) return;

    	//System.out.println("++++");
    	if((arr[left]+arr[right])==target){
    		ArrayList<Integer> temp = new ArrayList<Integer>();

    		temp.add(arr[currPos]);
    		temp.add(arr[left]);
    		temp.add(arr[right]);

    		res.add(temp);
    	}else if((arr[left]+arr[right])>target){
    		findTarget(arr, target, currPos, left, right-1);
    	}else{
    		findTarget(arr, target, currPos, left+1, right);
    	}
    }

    public void test1(){
    	int[] a = {-1, 0, 1, 2, -1, -4};
    	System.out.println(threeSum(a));
    }
}