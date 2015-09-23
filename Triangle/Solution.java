public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> currMin = null;
        List<Integer> prevMin = null;
    	for(int i=0; i<triangle.size();i++){
    		currMin = new ArrayList<Integer>();
    		if(i==0){//first row of triangle
    			currMin. add(triangle.get(0).get(0));
    		}else{
    			List<Integer> currRow = triangle.get(i);

    			for(int j=0; j<currRow.size(); j++){
    				if(j==0){
    					currMin.add(prevMin.get(0)+currRow.get(0));
    				}else if(j==currRow.size()-1){
    					currMin.add(prevMin.get(prevMin.size()-1)+currRow.get(j));
    				}else{
    					int temp = Math.min(currRow.get(j)+prevMin.get(j), currRow.get(j)+prevMin.get(j-1));
    					currMin.add(temp);
    				}
    			}
    		}
    		prevMin = currMin;
    	}

    	int globalMin = Integer.MAX_VALUE;
    	for(Integer i:prevMin){
    		globalMin = Math.min(i,globalMin);
    	}

    	return globalMin;
    }


    public int minimumTotal_v2(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
        return triangle.get(0).get(0);
    }
}