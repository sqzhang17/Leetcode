public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public int addDigits(int num) {
        while(num>9){
        	int sum =0;

        	while(num!=0){
        		sum += num%10;
        		num/=10;
        	}

        	num=sum;
        }

        return num;
    }

    public void test1(){
    	System.out.println(addDigits(38));
    }
}