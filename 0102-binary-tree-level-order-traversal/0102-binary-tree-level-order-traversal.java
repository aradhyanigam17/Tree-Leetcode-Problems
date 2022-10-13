/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>() ;
        if(root == null){
            return ans; 
        }
        
        Queue<TreeNode> que = new LinkedList<>() ;
        
        que.offer(root) ;
        
        while(!que.isEmpty()){
            ArrayList<Integer> inner = new ArrayList<>() ;
            
            int level = que.size() ;
            

            
            for(int i = 0 ; i < level ; i++){
                TreeNode ref = que.poll() ;              
                
                if(ref.left != null){
                    que.offer(ref.left) ;
                }
                if(ref.right != null){
                    que.offer(ref.right) ;
                }
                inner.add(ref.val) ;
            }
            ans.add(inner) ;
        }
        return ans ;
    }
}