import java.util.*;
public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
		s.test2();
	}

	//tle solution
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

    public int maxProfit_v2(int[] prices){
    	if(prices ==null || prices.length<=1)return 0;

    	int min = prices[0];
    	int profit = 0;

    	for(int i=0; i<prices.length;i++){
    		min = Math.min(prices[i], min);
    		profit= Math.max(profit, prices[i]-min);
    	}

    	return profit;
    }
    public void test1(){
    	int[] a={1,2,9,4,5};

    	System.out.println(maxProfit(a));
    }
    public void test2(){
    	int[] a={1,2,9,4,5};

    	System.out.println(maxProfit_v2(a));
    }
}