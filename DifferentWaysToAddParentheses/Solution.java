import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();

		s.test1();
		s.test2();
	}

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();

        for(int i=0; i<input.length();i++){
        	if("+-*".indexOf(input.charAt(i))!=-1){//char is an operator
        		List<Integer> part1 = diffWaysToCompute(input.substring(0,i));
        		List<Integer> part2 = diffWaysToCompute(input.substring(i+1));

        		for(Integer i1:part1){
        			for(Integer i2:part2){
        				int c=0;

        				if(input.charAt(i)=='+'){
        					c=i1+i2;
        				}else if(input.charAt(i)=='-'){
        					c=i1-i2;
        				}else if(input.charAt(i)=='*'){
        					c=i1*i2;
        				}
        				res.add(c);
        			}
        		}
        	}
        }

        if(res.isEmpty()){
        	res.add(Integer.valueOf(input));
        }

        return res;
    }

    public void test1(){
    	String a = "1+0";

    	System.out.println(diffWaysToCompute(a));
    }

    public void test2(){
    	String a = "2-1-1";

    	System.out.println(diffWaysToCompute(a));
    }
}