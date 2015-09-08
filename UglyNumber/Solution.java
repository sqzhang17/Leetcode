public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public boolean isUgly(int num) {
    	if(num==0) return false;
        if(num==1 || num==2 || num==3 || num==5) return true; 

        if(num%2!=0 && num%3!=0 && num%5!=0) return false;

        return (num%2==0 && isUgly(num/2)) || (num%3==0 && isUgly(num/3)) || (num%5==0 && isUgly(num/5));
    }

    public void test1(){
    	System.out.println(isUgly(8));
    }

    public boolean isUgly_v2(int num) {
        if (num <= 0) {return false;}
	    if (num == 1) {return true;}
	    if (num % 2 == 0) {
	        return isUgly(num/2);
	    }
	    if (num % 3 == 0) {
	        return isUgly(num/3);
	    }
	    if (num % 5 == 0) {
	        return isUgly(num/5);
	    }
	    return false;
	}
}