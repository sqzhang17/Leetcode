public class Solution {
    public int reverse(int x) {
        boolean isNegative =false;
        if(x<0){
            isNegative=true;
            x=x*(-1);
        }
        
        int res=0;
        
        while(x!=0){
            if(res>(Integer.MAX_VALUE-x%10)/10){
                return 0;
            }
            
            res =res*10+x%10;
            x=x/10;
        }
        
        return isNegative?res*(-1):res;
    }
}