public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0) return false; 

        Set<Integer> res = new HashSet<Integer>();

        for(int i:nums){
        	if(res.contains(i)){
        		return true;
        	}else{
        		res.add(i,0);
        	}
        }
        return false;
    }

    
}