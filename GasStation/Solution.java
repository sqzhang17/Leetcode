/*
1, if sum of gas is more than sum of cost, 
then there must be a solution. 
And the question guaranteed that the solution is unique
(The first one I found is the right one). 

2, The tank should never be negative, 
so restart whenever there is a negative number.
*/

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public int canCompleteCircuit(int[] gas, int[] cost) {
        public int canCompleteCircuit(int[] gas, int[] cost) {
		    int sumGas = 0;
		    int sumCost = 0;
		    int start = 0;
		    int left = 0;
		    for (int i = 0; i < gas.length; i++) {
		        sumGas += gas[i];
		        sumCost += cost[i];
		        left += gas[i] - cost[i];
		        if (left < 0) {
		            start = i + 1;
		            left = 0;
		        }
		    }
		    if (sumGas < sumCost) {
		        return -1;
		    } else {
		        return start;
		    }
		}
    }
    public void test1(){
    	int[] a={4,6,8};
		int[] b={5,3,4};
		canCompleteCircuit(a,b);
    }
}