public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums==null || nums.length==0) return -1;
        if(nums.length==1) return nums[0];

        int len = nums.length/2;

        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for(int i:nums){
        	if(cache.containsKey(i)){
        		if(cache.get(i)+1>len){
        			return i;
        		}else{
        			cache.put(i, cache.get(i)+1);
        		}
        	}else{
        		cache.put(i,1);
        	}
        }
        return -1;
    }
}