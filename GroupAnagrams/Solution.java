public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();

        if(strs==null || strs.length==0) return res; 

        boolean[] isVisted = new boolean[strs.length];

        Arrays.sort(strs);
        
        for(int i=0; i<strs.length; i++){
        	if(isVisted[i]) continue;

        	isVisted[i]=true;

        	List<String> temp = new ArrayList<String>();
        	temp.add(strs[i]);

        	for(int j=i+1; j<strs.length; j++){
        		if(isVisted[j]) continue;
        		
        		if(isAnagrams(strs[i], strs[j])){
        			temp.add(strs[j]);
        			isVisted[j]=true;
        		}
        	}

        	//Collections.sort(temp);
        	res.add(temp);
        }

        return res;
    }

    public boolean isAnagrams(String s, String t){
    	int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}