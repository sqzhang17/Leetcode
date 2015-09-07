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


    public List<List<Integer>> threeSum_OJ(int[] num) {
    	List<List<Integer>> res = new LinkedList<>(); 
    	
        if(num==null || num.length<3) return res;

        Arrays.sort(num);

	    for (int i = 0; i < num.length-2; i++) {
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) { //void duplicate triplet when traverse the array
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
	            while (lo < hi) {
	                if (num[lo] + num[hi] == sum) {
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    while (lo < hi && num[lo] == num[lo+1]) lo++; //void duplicate when moving left/right pointer
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;
	                    lo++; hi--;
	                } else if (num[lo] + num[hi] < sum) {
	                    while (lo < hi && num[lo] == num[lo+1]) lo++;
	                    lo++;
	                } else {
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;
	                    hi--;
	                }
	            }
	        }
	    }

        return res;
    }
}