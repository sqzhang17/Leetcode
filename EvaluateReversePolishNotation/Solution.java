import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test();
	}
	//wrong solution:
	//{"4", "13", "5", "/", "+"}
	// 13/5+4 should be the order
    public int evalRPN(String[] tokens) {
        if(tokens==null) return 0;

        Queue<String> nums = new LinkedList<String>();
        Queue<String> operators = new LinkedList<String>();

        for(String s:tokens){
        	if("+-*/".indexOf(s)==-1){
        		nums.offer(s);
        	}else{
        		operators.offer(s);
        	}
        }

        while(operators.size()!=0){
        	int num1 = Integer.valueOf(nums.poll());
        	int num2 = Integer.valueOf(nums.poll());
        	String op = operators.poll();

        	//System.out.println(num1+", "+num2+", "+op);
        	int res=0;
        	if(op.equals("+")){
        		res=num1+num2;
        	}else if(op.equals("-")){
        		res=num1-num2;
        	}else if(op.equals("*")){
        		res=num1*num2;
        	}else{
        		res=num1/num2;
        	}

        	nums.offer(res+"");
        }


        return Integer.valueOf(nums.poll());
    }

    public void test(){
    	String[] s = {"2", "1", "+", "3", "*"};
    	System.out.println(evalRPN(s));
    }
}