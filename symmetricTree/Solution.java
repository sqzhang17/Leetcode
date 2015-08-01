public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true; 
        
        Queue<TreeNode> leftSub = new LinkedList<TreeNode>();
        Queue<TreeNode> rightSub = new LinkedList<TreeNode>();
        
        leftSub.add(root.left);
        rightSub.add(root.right);
        
        while(!leftSub.isEmpty() && !rightSub.isEmpty()){
            TreeNode TnFromL = leftSub.poll();
            TreeNode TnFromR = rightSub.poll();
            
            if(TnFromL!=null && TnFromR!=null){// both not null
                if(TnFromL.val != TnFromR.val) {//not equal value  
                    return false;
                }else{//equal value -> continue adding into stack
                    leftSub.add(TnFromL.left);
                    leftSub.add(TnFromL.right);
            
                    rightSub.add(TnFromR.right);
                    rightSub.add(TnFromR.left);
                }
            }else if((TnFromL==null && TnFromR!=null) || (TnFromL!=null && TnFromR==null)){//encounter null
                return false; 
            }   
        }
        
        //check stacks after while loop
        return leftSub.isEmpty() && rightSub.isEmpty();
    }
}