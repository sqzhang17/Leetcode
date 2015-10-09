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
}