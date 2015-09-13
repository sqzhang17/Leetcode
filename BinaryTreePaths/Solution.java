import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();

        if(root==null) return res;

        //StringBuilder temp = new StringBuilder();
        String temp = "";
        helper(res, temp, root);

        return res;
    }

    private void helper(List<String> list, String s, TreeNode tn){

    	if(tn.right==null && tn.left==null){
    		list.add(s+tn.val);
    	}
    	if(tn.left!=null) {
    		helper(list, s+tn.val+"->", tn.left);
    	}
    	if(tn.right!=null){
    		helper(list, s+tn.val+"->", tn.right);
    	}

    }

    private void test1(){
    	TreeNode tn1= new TreeNode(1);
    	TreeNode tn2= new TreeNode(2);
    	TreeNode tn3= new TreeNode(3);
    	TreeNode tn4= new TreeNode(4);
    	
    	tn1.left=tn2;
    	tn1.right=tn3;
    	tn2.right=tn4;
    	System.out.println(binaryTreePaths(tn1));
    }
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val=val;
	}
}