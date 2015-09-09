import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
	}
	//wrong solution:
	//{"4", "13", "5", "/", "+"}
	// 13/5+4 should be the order
    public int evalRPN(String[] tokens) {
        if(tokens==null) return 0;

        Stack<Integer> nums = new Stack<Integer>();
        
        for(String s:tokens){
        	if(s.equals("+")){
        		nums.push(nums.pop()+nums.pop());
        	}else if(s.equals("-")){
        		int a = nums.pop();
        		int b = nums.pop();
        		nums.push(b-a);
        	}else if(s.equals("*")){
        		nums.push(nums.pop()*nums.pop());
        	}else if (s.equals("/")){
        		int a = nums.pop();
        		int b = nums.pop();
        		nums.push(b/a);
        	}else{
        		nums.push(Integer.valueOf(s));
        	}
        }

        return Integer.valueOf(nums.pop());
    }

    public void test1(){
    	String[] s = {"2", "1", "+", "3", "*"};
    	System.out.println(evalRPN(s));
    }

    public void test2(){
    	String[] s ={"4", "13", "5", "/", "+"};
    	System.out.println(evalRPN(s));
    }
}