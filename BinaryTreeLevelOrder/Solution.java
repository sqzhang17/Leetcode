public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(root==null) return res; 
        
        int curlv = 1; 
        
        Queue<TreeNode> tnq = new LinkedList<TreeNode>();
        Queue<Integer> lvq = new LinkedList<Integer>();
        
        tnq.add(root);
        lvq.add(curlv);
        
        while(!tnq.isEmpty()){
            List<Integer> templist = new ArrayList<Integer>();
            while(!lvq.isEmpty() && lvq.peek()==curlv){
                TreeNode temptn = tnq.poll();
                templist.add(temptn.val);
                lvq.poll();
                
                if(temptn.left!=null){
                    tnq.add(temptn.left);
                    lvq.add(curlv+1);
                }
                
                if(temptn.right!=null){
                    tnq.add(temptn.right);
                    lvq.add(curlv+1);
                }
            }
            
            curlv++;
            res.add(templist);
        }
        
        return res;
    }
}