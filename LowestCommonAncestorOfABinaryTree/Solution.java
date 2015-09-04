import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test2();
	}

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    if (root == null || root == p || root == q) return root;
	    TreeNode left = lowestCommonAncestor(root.left, p, q);
	    TreeNode right = lowestCommonAncestor(root.right, p, q);
	    if(left != null && right != null){
	    	return root;
	    }else if(left!=null){
	    	return left;
	    }else if(right!=null){
	    	return right;
	    }else{
	    	return null;
	    }
    }

    

    public void test2(){
    	TreeNode tn1 = new TreeNode(1);
    	TreeNode tn2 = new TreeNode(2);
    	TreeNode tn3 = new TreeNode(3);
    	TreeNode tn4 = new TreeNode(4);

    	tn1.left=tn2;
    	tn1.right=tn3;
    	tn2.left=tn4;

    	System.out.println(lowestCommonAncestor(tn1, tn2, tn3));
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public String toString(){
    	return this.val+"-> ";
    }
}