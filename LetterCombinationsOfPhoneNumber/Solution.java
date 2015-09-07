import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
    	List<String> prev = new ArrayList<String>();
    	List<String> curr = null;


        for(char c: digits.toCharArray()){
        	curr = new ArrayList<String>();
        	int cnt = prev.size();

        	String added=null;
        	switch(c){
        		case '2': added="abc"; break;
        		case '3': added="def"; break;
        		case '4': added="ghi"; break;
        		case '5': added="jkl"; break;
        		case '6': added="mno"; break;
        		case '7': added="pqrs"; break;
        		case '8': added="tuv"; break;
        		case '9': added="wxyz"; break;
        		default: added="";
        	}

        	if(cnt==0){
        		//System.out.println("+++");
        		for(char ac:added.toCharArray()){
        			curr.add(ac+"");
        		}
        	}else{
	        	for(int i=0; i<cnt; i++){
	        		String temp = prev.get(i);

	        		for(char ac:added.toCharArray()){
        				curr.add(temp+ac);
        			}
	        	}
	        }
	        prev=curr;
	        //System.out.println(prev);
        }

        return prev;
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    private void test1(){
    	String s = "23";
    	System.out.println(letterCombinations(s));
    }
}