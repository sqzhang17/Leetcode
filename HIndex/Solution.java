import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public int hIndex(int[] citations) {
        if(citations==null || citations.length==0) return 0;

        Arrays.sort(citations);

        for(int i=0;i<citations.length;i++){
        	if(citations.length-i<=citations[i]){
        		return citations.length-i;
        	}
        } 

        return 0;
    }

    public void test1(){
    	int[] a = {3,0,6,1,5}; 
    	System.out.println(hIndex(a));
    }
}