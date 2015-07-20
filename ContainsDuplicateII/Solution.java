public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums==null||nums.length<=1) return false;
        
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i]) && (i-hm.get(nums[i]))<=k){
                return true;                
            }else{
                hm.put(nums[i],i);
            }
        }
        
        return false;
    }
}