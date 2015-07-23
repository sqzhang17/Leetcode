public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        
        if(strs.length==1) return strs[0];
        
        String curRes = strs[0];
        
        for(int pos=1; pos<strs.length; pos++){
            if(strs[pos]==null || strs[pos].length()==0) return "";
            
            String temp="";
            for(int i=0; i<Math.min(curRes.length(),strs[pos].length());i++){
                if(curRes.charAt(i)==strs[pos].charAt(i)){
                    temp+=curRes.charAt(i);
                }else{
                    break;
                }
            }
            curRes=temp;
        }
        
        return curRes;
    }
}