import java.util.*;

public class Solution{
    public static void main(String[] args){
        Solution s = new Solution();
        s.test1();
    }

    public  String largestNumber(int[] num) {
        if(num==null || num.length==0)
            return "";
        String[] Snum = new String[num.length];
        for(int i=0;i<num.length;i++)
            Snum[i] = num[i]+"";

        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                String s1 = str1+str2;
                String s2 = str2+str1;
                //System.out.println("str1="+str1+"; str2="+str2+"; s1.compareTo(s2)="+s1.compareTo(s2));
                return s1.compareTo(s2);
            }
        };

        Arrays.sort(Snum,comp);

        if(Snum[Snum.length-1].charAt(0)=='0')
            return "0";

        StringBuilder sb = new StringBuilder();

        for(String s: Snum)
            sb.insert(0, s);

        return sb.toString();
    }

    public void test1(){
        int[] a = {3,30,34,5,9};
        System.out.println(largestNumber(a));
    }
}