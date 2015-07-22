public class Solution_resultIsInt{

    public int myAtoi(String str) {
        public class Solution {
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
        
        int res=0;
        
        while(pos<str.length()){
            if(ca[pos]>='0' && ca[pos]<='9'){
                if((res==Integer.MAX_VALUE/10 && !isNegative && ca[pos]>'7') || (res>Integer.MAX_VALUE/10 && !isNegative)){//check positive overflow
                    return Integer.MAX_VALUE;
                }else if((res==Integer.MAX_VALUE/10 && isNegative && ca[pos]>'8') || (res>Integer.MAX_VALUE/10 && isNegative)){//check negative overflow
                    return Integer.MIN_VALUE;
                }else{//not overflow
                    res=res*10+ca[pos]-'0';
                    pos++;
                }
            }else{
                break;
            }
        }
        
        return isNegative?(-1)*res:res;
    }
}
    }
}