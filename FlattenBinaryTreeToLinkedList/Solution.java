public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test();
	}
    public void flatten(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;

        flatten(left);
        flatten(right);

        root.right = left;
        TreeNode cur = root;
        while (cur.right != null) cur = cur.right;
        cur.right = right;
    }


    public void test(){
    	TreeNode tn1 = new TreeNode(1);
    	TreeNode tn2 = new TreeNode(2);
    	TreeNode tn3 = new TreeNode(3);
    	TreeNode tn4 = new TreeNode(4);
    	TreeNode tn5 = new TreeNode(5);

    	tn1.left=tn2;
    	tn1.right=tn4;

    	tn2.left=tn3;
    	tn4.right=tn5;

    	flatten(tn1);
    	System.out.println(tn1);
    }
}



//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public String toString(){
    	//+this.left+", "+this.right+";"
    	return this.val+","+this.left+", "+this.right+";";
    }
}