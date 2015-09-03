import java.util.*;

public class Solution {
	public static void main(String[] args){
		Solution s = new Solution();
		s.test1();

		s.test2();
	}

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();

        if(root==null) return res; 

        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();

        nodeQueue.offer(root);

        while(!nodeQueue.isEmpty()){
            int count = nodeQueue.size();
            for(int i=0;i<count;i++){
                TreeNode temp = nodeQueue.poll();
                if(i==count-1) res.add(temp.val);

            	if(temp.left!=null) {
            		nodeQueue.offer(temp.left);
            	}

            	if(temp.right!=null) {
            		nodeQueue.offer(temp.right);
            	}
            }
        }

        return res;
    }

    public void test1(){
    	TreeNode t1 = new TreeNode(1);

    	System.out.println(rightSideView(t1));
    }

    public void test2(){
    	TreeNode t1 = new TreeNode(1);
    	TreeNode t2 = new TreeNode(2);
    	TreeNode t3 = new TreeNode(3);
    	TreeNode t4 = new TreeNode(4);

    	t1.right=t2;
    	t1.left=t3;
    	t3.right=t4;

    	System.out.println(rightSideView(t1));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public String toString(){
    	return this.val+", ";
    }
}