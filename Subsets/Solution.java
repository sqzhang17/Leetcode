import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
		s.test3();
		s.test4();
	}

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());

        if(nums==null || nums.length==0) return res;

        //Elements in a subset must be in non-descending order.
        //due to this requirement, input array must be sorted;
        Arrays.sort(nums);

        for(int i: nums){
        	int l = res.size();

        	for(int j=0;j<l;j++){
        		//List<Integer> temp =res.get(j)
        		//above will cause problem, since the reference type temp still
        		//point to res.get(i), when temp changes, res.get(i) it self change
        		List<Integer> temp = new ArrayList<Integer>(res.get(j));

        		temp.add(i);
        		res.add(temp);
        	}
        }

        return res;
    }

    public void test1(){
    	int[] a ={1,2,3};
    	System.out.println(subsets(a));
    }
    public void test2(){
    	int[] a ={1};
    	System.out.println(subsets(a));
    }
    public void test3(){
    	int[] a ={};
    	System.out.println(subsets(a));
    }
    public void test4(){
    	int[] a=null;
    	System.out.println(subsets(a));
    }
}