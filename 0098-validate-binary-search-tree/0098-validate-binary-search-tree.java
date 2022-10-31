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
    public boolean isValidBST(TreeNode root) {
        return validBst(root , Long.MIN_VALUE , Long.MAX_VALUE) ;
    }
    
    public boolean validBst(TreeNode node, long minVal , long maxVal){
        
        if(node == null) return true ;
        if(node.val >= maxVal || node.val <= minVal) return false ;
        return validBst(node.left, minVal , node.val) && validBst(node.right, node.val , maxVal) ;
    }
}