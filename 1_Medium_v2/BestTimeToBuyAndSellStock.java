public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices ==null || prices.length<=1)return 0;

    	int min = prices[0];
    	int profit = 0;

    	for(int i=0; i<prices.length;i++){
    		min = Math.min(prices[i], min);
    		profit= Math.max(profit, prices[i]-min);
    	}

    	return profit;
    }
}