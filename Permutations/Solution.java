import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null|| nums.length==0) return res;

        for(int i=0; i<nums.length;i++){
        	int tempInt = nums[i];
        	int ls = res.size();

        	if(ls==0){//res is empty
        		ArrayList<Integer> tempAL_first = new ArrayList<Integer>();
        		tempAL_first.add(tempInt);
        		res.add(tempAL_first);
        	}else{//res is NOT empty
	        	for(int j=0;j<ls;j++){
	        		List<Integer> tempAL_removed = res.remove(0);

	        		for(int k=0;k<=tempAL_removed.size();k++){
	        			ArrayList<Integer> tempAL_added = new ArrayList<Integer>();
	        			tempAL_added.addAll(tempAL_removed);
	        			tempAL_added.add(k,tempInt);
	        			//System.out.println(tempAL_added);
	        			res.add(tempAL_added);
	        		}
	        	}
	        }
        }

        return res;
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    public void test1(){
    	int[] a = {1,2,3};
    	System.out.println(permute(a));
    }
}