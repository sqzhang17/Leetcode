public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0) return null;

        return helper(nums, 0, nums.length-1);
    }

    private TreeNode helper(int[] a, int l, int r){
    	if(l<0 || r>=a.length || l>r) return null;

    	if(l==r){
    		return new TreeNode(a[l]);
    	}else{
    		int m = (l+r)/2;

    		TreeNode temp = new TreeNode(a[m]);
    		temp.left=helper(a,l,m-1);
    		temp.right=helper(a,m+1,r);
    		return temp;
    	}
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}