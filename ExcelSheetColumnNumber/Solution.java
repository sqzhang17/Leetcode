public class Solution {
    public int titleToNumber(String s) {
        if(s==null || s.length()==0) return 0;
        
        int res = 0;

        for(char i: s.toCharArray()){
           res = res*26+(i-'A'+1); 
        }
        
        return res;
    }
}