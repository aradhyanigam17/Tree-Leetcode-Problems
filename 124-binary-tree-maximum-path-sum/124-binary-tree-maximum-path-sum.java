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
    public int maxPathSum(TreeNode root) {
        
        if(root == null) return 0 ;
        
        int[] max = new int[1] ;
        
        max[0] = Integer.MIN_VALUE ;
        max(root , max);
        
        return max[0] ;
        
    }
    
    public int max(TreeNode node , int[] maxvalue){
        if(node == null) return 0 ;
        
        int left = Math.max(0 , max(node.left , maxvalue));
        int right = Math.max(0 , max(node.right , maxvalue));
        
        maxvalue[0] = Math.max(maxvalue[0] , node.val + left + right);
        
        return node.val + Math.max(left , right);
    }
}