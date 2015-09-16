

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
        return val;
    }
}