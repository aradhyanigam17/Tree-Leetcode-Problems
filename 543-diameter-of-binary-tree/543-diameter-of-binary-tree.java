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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1] ;
        height(root , diameter);
        
        return diameter[0] ;
        
    }
    
    public int height(TreeNode node, int[] diameter){
        if(node == null) return 0 ;
        
        int left = height(node.left , diameter);
        int right = height (node.right , diameter);
        
        diameter[0] = Math.max(diameter[0], left + right);
        
        return 1 + Math.max(left,right) ;
    }
}