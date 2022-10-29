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
        List<List<Integer>> level = new ArrayList<>() ;
        if(root == null){
            return level ;
        }
        
        Queue<TreeNode> que = new LinkedList<>() ;
        
        que.offer(root) ;
        
        while(! que.isEmpty()){ 
            int levelsize = que.size() ;
            
            List<Integer> innerList = new ArrayList<>() ;
            
            for(int i = 0 ; i < levelsize ;i++){
                TreeNode node = que.poll() ;
                
                if(node.left != null){
                    que.offer(node.left) ;
                }
                
                if(node.right != null){
                    que.offer(node.right) ;
                }
                
                innerList.add(node.val) ;
            }
            level.add(innerList) ;
            
        }
        
        return level ;
        
    }
}