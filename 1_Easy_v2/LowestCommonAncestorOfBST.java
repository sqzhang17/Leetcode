public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || (p==null && q==null)) return root;
        
        if(p==null && q!=null) return p;
        if(p!=null && q==null) return q;
        
        if(root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}