public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        
        if(n==1 || n==2) return true;
        
        return n%2==0 && isPowerOfTwo(n/2);
    }
}