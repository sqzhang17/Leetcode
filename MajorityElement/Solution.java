public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        
       HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
       
       for(int i: nums){
           if(hs.containsKey(i)){
               if(hs.get(i)+1>Math.floor(nums.length/2)){
                   return i;
               }else{
                    hs.put(i, hs.get(i)+1);
               }
           }else{
               hs.put(i,1);
           }
       } 
       
       return -1;
    }
}