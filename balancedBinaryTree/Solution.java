public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        if( Math.abs(depth(root.left)-depth(root.right))>1){
            return  false;
        }
        
        return isBalanced(root.right) && isBalanced(root.left);
        
    }
    
    private int depth(TreeNode tn){
        if(tn==null) return 0;
        
        return Math.max(depth(tn.right), depth(tn.left))+1;
    }

}