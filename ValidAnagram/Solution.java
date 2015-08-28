import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();

		s.test1();
		s.test2();
	}

    public boolean isAnagram(String s, String t) {
        if(s==null && t ==null) return true; 

        if(s==null || t==null) return false; 

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        String ns = new String(sc);
        String nt = new String(tc);

        return ns.equals(nt);
    }


    public boolean isAnagram_v2(String s, String t) {
        Map<Character, Integer> table_s = new HashMap<Character, Integer>();
        for (char i:s.toCharArray()) {
            if (table_s.containsKey(i)) table_s.put(i,table_s.get(i)+1);
            else table_s.put(i,1);
        }
        
        Map<Character, Integer> table_t = new HashMap<Character, Integer>();
        for (char i:t.toCharArray()) {
            if (table_t.containsKey(i)) table_t.put(i,table_t.get(i)+1);
            else table_t.put(i,1);
        }
        
        return table_t.equals(table_s);
    }

    public void test1(){
    	System.out.println(isAnagram("abb","bba"));
    }

    public void test2(){
    	System.out.println(isAnagram("car","bar"));
    }
}