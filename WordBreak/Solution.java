public class Solution {
    public boolean wordBreak_tle(String s, Set<String> wordDict) {
        if(s==null || s.length()==0) return false;

        if(wordDict.contains(s)) return true;

        for(int i=1;i<s.length();i++){
        	if(wordDict.contains(s.substring(0,i))){
        		String sRight = new String(s.substring(i));
        		if(wordBreak(sRight,wordDict)){
        			return true;
        		}
        	}
        }

        return false;
    }

    
    //It is a DP solution, 
    //the array breakable[i] stores whether the substring s.substring(0,i) is breakable or not. 
    //The DP equation is as follows: breakable[i+1] |= breakable[j]&&dict.contains(s.substring(j,i+1)), 
    //j>=0 && j<i+1
    public boolean wordBreak(String s, Set<String> dict) {
        boolean [] breakable = new boolean[s.length()+1];
        breakable[0] = true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(breakable[j]&&dict.contains(s.substring(j,i))){
                    breakable[i] = true;
                    break;
                }
            }
        }
        return breakable[s.length()];
    }
}