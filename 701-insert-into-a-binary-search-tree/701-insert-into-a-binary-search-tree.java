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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val) ;
        
        TreeNode cur = root ;
        insert(root , val);
        return root ;
        
    }
    
    public void insert(TreeNode root , int val){
        if(val <= root.val) {
            if(root.left == null) root.left = new TreeNode(val);
            else{
                insert(root.left , val);
            }     
        }
        else{
            if(root.right == null) root.right = new TreeNode(val);
            else{
                insert(root.right, val) ;
            }
        }
    }
}