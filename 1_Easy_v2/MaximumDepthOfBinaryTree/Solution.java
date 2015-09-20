public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        
        //remove the next line would make it faster
        //if(root.left==null && root.right==null) return 1;

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}