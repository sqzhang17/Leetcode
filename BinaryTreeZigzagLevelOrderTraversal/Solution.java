/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

       if(root==null) return res;
       List<TreeNode> prev = new ArrayList<TreeNode>();
       prev.add(root);
       
       List<Integer> l = new ArrayList<Integer>();
       l.add(root.val);
       res.add(l); 

       boolean forward =false;

       while(prev.size()!=0){
       		List<Integer> curr = new ArrayList<Integer>();
       		int s = prev.size();
       		List<TreeNode> currNode = new ArrayList<TreeNode>();

       		for(int i=s-1; i>=0;i--){
       			TreeNode temp = prev.get(i);

       			if(forward){
       				if(temp.left!=null){
       					curr.add(temp.left.val);
       					currNode.add(temp.left);
       				}

       				if(temp.right!=null){
       					curr.add(temp.right.val);
       					currNode.add(temp.right);
       				}
       			}else{
       				if(temp.right!=null){
       					curr.add(temp.right.val);
       					currNode.add(temp.right);
       				}
       				if(temp.left!=null){
       					curr.add(temp.left.val);
       					currNode.add(temp.left);
       				}
       			}
       		}
       		
       		if(curr.size()!=0) res.add(curr);
       		
       		prev=currNode;
       		forward=!forward;
       }

       return res;
    }
}