public class Solution {
	private int maxIndex;
	private int maxLength;

	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
	}

    public String longestPalindrome(String s) {
        if(s==null || s.length()==0) return "";

        maxIndex=0;
        maxLength=0;

        for(int i=0; i<s.length();i++){
        	expand(s, i, 0);// longest odd length palindrome starting with i
        	expand(s, i, 1);// longest even length palindrome starting with i
        }

        return s.substring(maxIndex, maxIndex+maxLength);
    }


    private void expand(String str, int index, int shift){
    	int left=index;
    	int right=index+shift;

    	while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
    		if(right-left+1>maxLength){
    			maxIndex=left;
    			maxLength=right-left+1;
    		}
    		right++;
    		left--;
    	}
    }

    public void test1(){
    	System.out.println(longestPalindrome("abccbdef")); 
    }

    public void test2(){
    	System.out.println(longestPalindrome("abcbdef")); 
    }
}