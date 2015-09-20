import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();
	}

	public List<TreeNode> generateTrees(int n) {
	    return generateSubtrees(1, n);
	}

	private List<TreeNode> generateSubtrees(int s, int e) {
	    List<TreeNode> res = new LinkedList<TreeNode>();
	    if (s > e) {
	        res.add(null); // empty tree
	        return res;
	    }

	    for (int i = s; i <= e; ++i) {
	        List<TreeNode> leftSubtrees = generateSubtrees(s, i - 1);
	        List<TreeNode> rightSubtrees = generateSubtrees(i + 1, e);

	        for (TreeNode left : leftSubtrees) {
	            for (TreeNode right : rightSubtrees) {
	                TreeNode root = new TreeNode(i);
	                root.left = left;
	                root.right = right;
	                res.add(root);
	            }
	        }
	    }
	    return res;
	}


    public void test1(){
    	System.out.println(generateTrees(2));
    }
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}

	public String toString(){
		return this.val+", "+this.left+", "+this.right+";";
	}
}