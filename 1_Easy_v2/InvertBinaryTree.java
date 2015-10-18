public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        
        TreeNode tempR = invertTree(root.right);
        TreeNode tempL = invertTree(root.left);
        
        root.right=tempL;
        root.left=tempR;
        
        return root;
    }
}