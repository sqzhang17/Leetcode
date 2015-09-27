public class Solution {	
	public List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return res; 
        pathSumCheck(root, sum, 0, new ArrayList<Integer>());
        return res;
    }

    private void pathSumCheck(TreeNode root, int target,int sumTillParent, List<Integer> listTillParent){
    	if(root==null) return;

    	if(root.left==null && root.right==null && root.val+sumTillParent==target){
    	    listTillParent.add(root.val);
    		res.add(listTillParent);
    	}

    	listTillParent.add(root.val);


    	if(root.left!=null){
    		pathSumCheck(root.left, target, root.val+sumTillParent, new ArrayList<Integer>(listTillParent));
    	}

    	if(root.right!=null){
    		pathSumCheck(root.right, target, root.val+sumTillParent, new ArrayList<Integer>(listTillParent));
    	}

    	listTillParent.remove(listTillParent.size()-1);

    	return;
    }

}