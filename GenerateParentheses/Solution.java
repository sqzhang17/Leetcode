import java.util.*;
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if(n==0) return res;

        expand(res, "", n, n);
        return res;
    }

    private void expand(List<String> l, String curr, int l_remain, int r_remain){
    	if(l_remain==0 && r_remain==0){
    		l.add(curr);
    	}

    	if(l_remain!=0){
    		expand(l, curr+"(", l_remain-1, r_remain);
    	}

    	if(r_remain>l_remain){
    		expand(l, curr+")", l_remain, r_remain-1);
    	}
    }

    public static void main(String[] args){
    	Solution s = new Solution();
    	s.test1();
    }

    public void test1(){
    	System.out.println(generateParenthesis(0));
    }
}