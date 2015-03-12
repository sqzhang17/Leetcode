/**
* LeetCode: Path Sum
* 	Given a binary tree and a sum, 
* 	determine if the tree has a root-to-leaf path such 
* 	that adding up all the values along the path equals 
* 	the given sum.
*
* For each node (n):	
*	1. if this node is null --> false
*	2. else if the (prevSum+n.val)==sum, and n is leaf --> true
* 	3. else check the (right subtree || left subtree) 
*		with the prevSum=prevSum+n.val 
*
*@param: prevSum, the sum on current path
*@param: sum, the desired sum
*
*@author: Shiqi Zhang
*
*/

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return containSum(root,0,sum);
    }
    private boolean containSum(TreeNode tn, int prevSum, int sum){
    	if(tn==null){
    		return false;
    	}else if(tn.val+prevSum==sum && tn.left==null && tn.right==null){
    		return true;
    	}else{
    		return containSum(tn.left,prevSum+tn.val,sum)||
    			containSum(tn.right,prevSum+tn.val,sum);
    	}
    }
}