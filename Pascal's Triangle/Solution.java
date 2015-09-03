import java.util.*; 

public class Solution {
	public static void main(String[] args){
		System.out.println(generate(5));
	}
    public static LinkedList<LinkedList<Integer>> generate(int numRows) {
    	//initiate the return list
        LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();

        //check if the input int is 0 
        if(numRows==0) return res;

        //initiate the list temp and list res
        LinkedList<Integer> temp = new LinkedList<Integer>();
        temp.add(1);
        res.add(temp);

        //loop (numRows-1) times since the [1] has been inputed into result list(res)
        for(int i=1;i<numRows;i++){
        	//for each loop, empty the temp list and set the prev list as the lastest list just put in.
        	temp=new LinkedList<Integer>();
        	LinkedList<Integer> prev = res.get(i-1);

        	//loop thru the prev list, and add item into the temp list
        	for(int j=0; j<=prev.size();j++){
        		if(j==0 || j==prev.size()){	//special case of the start and end 
        			temp.add(1);
        		}else{// regular case
        			temp.add(prev.get(j-1)+prev.get(j));
        		}
        	}
        
        
        	//add temp to res
        	res.add(temp);
        }

        //return
        return res;
    }
}