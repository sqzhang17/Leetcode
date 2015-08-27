public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		System.out.println(s.test_1());

		System.out.println(s.test_2());
	}

    public int missingNumber(int[] nums) {
    	int sum = (nums.length+1)*nums.length/2;

    	for(int pos=0; pos<nums.length;pos++){
    		sum-=nums[pos];
    	}

    	return sum;
    }

    public int test_1(){
    	int[] a = {0,1,3};
    	return missingNumber(a);
    }

    public int test_2(){
    	int[] a = {1,2,3};
    	return missingNumber(a);
    }
}