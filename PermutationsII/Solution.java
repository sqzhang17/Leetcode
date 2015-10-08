import java.util.*;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(nums==null || nums.length==0) return res;

        List<Integer> temp = new LinkedList<Integer>();
        temp.add(nums[0]);
        res.add(temp);

        //every int in nums
        for(int i=1; i<nums.length;i++){
        	int addItem = nums[i];

        	int size = res.size();
        	Set<String> cache = new HashSet<String>();

        	//every List<Integer> in res
        	for(int j=0; j<size; j++){
        		temp = res.remove(0);
        		//System.out.println(temp);
        		//every position in temp
        		for(int k=0; k<temp.size()+1; k++){
        			List<Integer> newL = new ArrayList<>(temp.subList(0,k));
                    newL.add(nums[i]);
                    newL.addAll(temp.subList(k,temp.size()));
                    if (cache.add(newL.toString())) res.add(newL);
        				//System.out.println(newList);
        		}
        	}
        	//System.out.println("++++++++");
        }

        return res;
    }
    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test();
    }

    public void test(){
    	int[] a = {1,2,1,1};
    	System.out.println(permuteUnique(a));
    }
}