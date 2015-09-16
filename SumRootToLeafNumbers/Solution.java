/*
key point:
	1.	in sumR method x is the sum up to root's parent;
	2.	in sumR method, "root=null then return 0"
		can be replaced by the if clause in the comment 
		the if clause way is faster!!!!
*/

public class Solution {
	public static void main(String[] args){

	}
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return sumR(root, 0);
    }

    public int sumR(TreeNode root, int x) {
        if(root==null) return 0;
        if (root.right == null && root.left == null)
            return 10 * x + root.val;
        int val = 0;
        val += sumR(root.left, 10 * x + root.val);
        val += sumR(root.right, 10 * x + root.val);

        /*
        if (root.left != null)
            val += sumR(root.left, 10 * x + root.val);
        if (root.right != null)
            val += sumR(root.right, 10 * x + root.val);
         */
        return val;
    }
}