public class HappyNumber {
    public boolean isHappy(int n) {
        List<Integer> cache = new ArrayList<Integer>();
        
        while(!cache.contains(n)){
            cache.add(n);
            int newN = 0;
            while(n!=0){
                int temp = n%10;
                newN+=temp*temp; 
                n/=10;
            }
            
            if(newN==1){
                return true;
            }else{
                n=newN;
            }
        }
        
        return false;
    }
}