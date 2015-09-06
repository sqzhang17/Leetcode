public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
		s.test3();
	}

    public int findPeakElement(int[] nums) {
        if(nums == null || nums.length<=1) return 0;

        for(int i=0;i<nums.length;i++){
        	if(i==0){
        		if(nums[i]>nums[i+1]){
        			return 0;
        		}
        	}else if(i==nums.length-1){
        		if(nums[nums.length-1]>nums[nums.length-2]){
        			return nums.length-1;
        		}
        	}else{
        		if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
        			return i;
        		}
        	}
        }

        return 0;
    }

public int findPeakElement_logn(int[] num) {    
    return helper(num,0,num.length-1);
}

public int helper(int[] num,int start,int end){
    if(start == end){
        return start;
    }else if(start+1 == end){
        if(num[start] > num[end]) return start;
        return end;
    }else{

        int m = (start+end)/2;

        if(num[m] > num[m-1] && num[m] > num[m+1]){

            return m;

        }else if(num[m-1] > num[m] && num[m] > num[m+1]){

            return helper(num,start,m-1);

        }else{

            return helper(num,m+1,end);

        }

    }
}

    public void test1(){
    	int[] a = {1,2,3,1};
    	System.out.println(findPeakElement(a));
    }

    public void test2(){
    	int[] a = {1,2,3,4};
    	System.out.println(findPeakElement(a));
    }

    public void test3(){
    	int[] a = {1,0,3,1};
    	System.out.println(findPeakElement(a));
    }
}