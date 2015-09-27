public class Solution {	
	public List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return res; 
        pathSumCheck(root, sum, 0, new ArrayList<Integer>);
    }

    private void pathSumCheck(TreeNode root, int target,int sumTillParent, List<Integer> listTillParent){
    	if(root==null) return;

    	if(root.left==null && root.right==null && root.val+sumTillParent==target){
    		
    	}
    }

}