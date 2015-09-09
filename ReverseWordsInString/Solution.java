public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
		s.test3();
	}
    public String reverseWords(String s) {
        if(s==null) return null;

        int l = s.length();

        StringBuilder res = new StringBuilder();

        StringBuilder temp = new StringBuilder();

        for(int i=l-1; i>=0; i--){
        	if(s.charAt(i)!=' '){
        		temp.insert(0, s.charAt(i));
        	}else{//s.charAt(i)==' '
        		if(temp.length()!=0){
        			res.append(temp.toString()+" ");
        			temp = new StringBuilder();
        		}
        	}
    	}

    	if(res.length()==0 && temp.length()==0) return "";

    	if(temp.length()==0){
    		return res.substring(0, res.length()-1);
    	}else{
    		return res.append(temp.toString()).toString();
    	}
	}

	public void test1(){
		String s = "  blue the sky    man   "; 
		System.out.println(reverseWords(s)+"     length is "+reverseWords(s).length());
	}

	public void test2(){
		String s = "  ";
		System.out.println(reverseWords(s)+"     length is "+reverseWords(s).length());
	}

	public void test3(){
		String s = " a ";
		System.out.println(reverseWords(s)+"     length is "+reverseWords(s).length());
	}
}