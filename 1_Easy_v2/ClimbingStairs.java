public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<=2) return n; 
        
        int prev =2;
        int prevprev = 1; 
        int curr = 0;
        
        for(int i=3; i<=n; i++){
            curr=prev+prevprev; 
            prevprev=prev;
            prev=curr;
        }
        return prev;
    }
}