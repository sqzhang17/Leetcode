public class Solution {	
	public List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return res; 
        pathSumCheck(root, sum, 0, new ArrayList<Integer>());
        return res;
    }

    private void pathSumCheck(TreeNode root, int target,int sumTillParent, List<Integer> listTillParent){
    	if(root==null) return;

    	//meet leaf node, and sum ==target
    	if(root.left==null && root.right==null && root.val+sumTillParent==target){
    	    listTillParent.add(root.val);
    		res.add(listTillParent);
    	}

    	//not reach the target
    	listTillParent.add(root.val);

    	//reaching left node
    	if(root.left!=null){
    		pathSumCheck(root.left, target, root.val+sumTillParent, new ArrayList<Integer>(listTillParent));
    	}

    	//reaching right node
    	if(root.right!=null){
    		pathSumCheck(root.right, target, root.val+sumTillParent, new ArrayList<Integer>(listTillParent));
    	}

    	//delete the last for going up to parent node 
    	listTillParent.remove(listTillParent.size()-1);


    	//return;
    }

}