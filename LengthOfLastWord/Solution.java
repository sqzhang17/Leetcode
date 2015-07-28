public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0) return 0;
        s=s.trim();
        String res="";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                return res.length();
            }else{
                res=s.charAt(i)+res;
            }
        }
        
        return s.length();
    }
}