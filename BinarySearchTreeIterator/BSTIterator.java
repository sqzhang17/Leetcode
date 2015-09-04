public class BSTIterator {
    public Stack<TreeNode> stack;
    
    public BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        
        pushAllLeft(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode cur = stack.pop();
        
        pushAllLeft(cur.right);
        
        return cur.val;
    }
    
    private void pushAllLeft(TreeNode n){
        if(n==null) return;
        
        stack.push(n);
        
        pushAllLeft(n.left);
    }
}