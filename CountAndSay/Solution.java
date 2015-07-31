public class Solution {
    public static void main(String[] args){
        //test master node 
    }
    public String countAndSay(int n ) {
        if(n==0) return "";
        
        String prev = "1" ;
        
        for(int i=1; i<n; i++){
            String res = new String();
            int count = 1;
            char cache =prev.charAt(0);
            
            for(int j=1; j<prev.length(); j++){
                if(prev.charAt(j)==cache){
                    count++;
                }else{
                    res +=count+""+cache;
                    cache=prev.charAt(j);
                    count=1;
                }
            }
            
            res +=count+""+prev.charAt(prev.length()-1);
            
            prev =res;
        }
        
        return prev;
    }
}