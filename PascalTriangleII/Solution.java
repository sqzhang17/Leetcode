import java.util.*;
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<Integer>();
        List<Integer> curr = null;
        
        prev.add(1);
        
        for(int i=0; i<rowIndex; i++){
            curr = new ArrayList<Integer>();
            
            curr.add(1);
            
            for(int j=1; j<prev.size(); j++){
                curr.add(prev.get(j)+prev.get(j-1));
            }
            
            curr.add(1);
            prev=curr;
        }
        return prev;
    }
}