public class Solution_resultIsDouble{
    public int myAtoi(String str) {
       if(str==null) return 0;
        
        str= str.trim(); 
        if(str.length()==0)return 0;
        
        char[] ca = str.toCharArray();
        
        int pos = 0;
        boolean isNegative=false;
        if(ca[0]=='+' || ca[0]=='-'){
            pos++;
            if(ca[0]=='-') isNegative=true;
        }
        
        double res=0;
        
        while(pos<str.length()){
            if(ca[pos]>='0' && ca[pos]<='9'){
                res=res*10+ca[pos]-'0';
                pos++;
            }else{
                break;
            }
        }
        
        if(isNegative) res=res*(-1);
        
        if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(res<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        

        return (int)res;
    }
}