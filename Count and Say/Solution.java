public class Solution {
	public static void main(String[] args){
		System.out.println(countAndSay(4));
	}
    public static String countAndSay(int n) {
        StringBuffer str= new StringBuffer();
        str.append("1");

        for(int i=1;i<n;i++){
        	int cache=0;
        	int runner=0;

        	int len =str.length();
        	StringBuffer tmp = new StringBuffer();
        	while(runner<len){
        		if(str.charAt(cache)!=str.charAt(runner)){
        			tmp.append(runner-cache);
        			tmp.append(str.charAt(cache));
        			cache=runner;
        		}
        		runner++;
      	  	}// end while
        	tmp.append(runner-cache);
        	tmp.append(str.charAt(cache));

        	str=new StringBuffer(tmp);
    }

        return str.toString();
    }// end countAndSay
}// end Solution