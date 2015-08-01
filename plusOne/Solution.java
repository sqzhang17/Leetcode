public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int tempSum = digits[i]+carry;
            digits[i]=(tempSum)%10;
            carry = tempSum/10;
            
           /* WRONG!!   the first line has changed digits[i] when second line reference it. 
            digits[i]=(digits[i]+carry)%10;
            carry = (digits[i]+carry)/10;
            */
            
        }
        
        if(carry==0){
            return digits;
        }
        
        int[] res = new int[digits.length+1];
        res[0]=carry;
        for(int i=0;i<digits.length;i++){
            res[i+1]=digits[i];
        }
        
        return res;
    }
}