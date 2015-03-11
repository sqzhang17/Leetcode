public class Solution {
	
	int totalSum;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;

        totalSum = 0;
        helper(root,0);
        return totalSum;
    }
    private void helper(TreeNode tn, int curSum){
    	if(tn.right==null && tn.left==null) totalSum+=curSum*10+tn.val;

    	if(tn.left!=null)  helper(tn.left, curSum*10+tn.val);
    	if(tn.right!=null) helper(tn.right, curSum*10+tn.val);
    }
}