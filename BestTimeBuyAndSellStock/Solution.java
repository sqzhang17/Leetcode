public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public int maxProfit(int[] prices) {
        if(prices ==null || prices.length<=1)return 0;

        int max =0;

        for(int i=0; i<prices.length;i++){
        	for(int j=i+1; j<prices.length; j++){
        		if(prices[j]-prices[i]>max){
        			max = prices[j]-prices[i];
        		}
        	}
        }

        return max;
    }

    public void test1(){
    	int[] a={1,2,1,4,5};

    	System.out.println(maxProfit(a));
    }
}