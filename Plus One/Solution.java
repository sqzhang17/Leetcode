import java.util.*;
public class Solution {
	public static void main(String[] args){
		int[] test={9,9,9};
		sop(test);
		sop(plusOne(test));
	}
    public static int[] plusOne(int[] digits) {
        int carry =1;
        int[] res=new int[digits.length+1];

        for(int i=digits.length-1;i>=0;i--){
        	int temp=digits[i]+carry;
        	carry=temp/10;
        	res[i+1]=temp%10;
        }

        if(carry==0){
        	res=Arrays.copyOfRange(res,1,res.length);
        }else{
        	res[0]=carry;
        }

        return res;
    }
    public static void sop(int[] a){
    	for(int i=0; i<a.length;i++){
    		System.out.print(a[i]+",");
    	}
    	System.out.println();
    }
}