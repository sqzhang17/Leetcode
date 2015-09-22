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

    public boolean containsDuplicate_v2(int[] nums) {
        if(nums==null || nums.length<2) return true;
        Arrays.sort(nums);

        for(int i=1; i<nums.length;i++){
        	if(nums[i]==nums[i-1]) return true;
        }

        return false;
    }
}