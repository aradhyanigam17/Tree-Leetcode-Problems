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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0 ;

            Queue<TreeNode> queue = new LinkedList<TreeNode>() ;
            int count = 0 ;
            
            queue.offer(root);
            
            while(!queue.isEmpty()){
                int level = queue.size(); 
                
                

                for (int i = 0; i < level; i++) {
                    
                    root = queue.poll();
                    
                    if(root.left != null) queue.offer(root.left);
                    if(root.right != null) queue.offer(root.right);
                }
                
                count++ ;
                
            }
            
            return count ;
            

    }
}