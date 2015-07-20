public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        
        if(root.right ==null && root.left==null) return root;
        
        TreeNode temp =root.left;
        
        root.left=root.right;
        
        root.right=temp;
        
        invertTree(root.right);
        invertTree(root.left);
        
        return root;
    }
}