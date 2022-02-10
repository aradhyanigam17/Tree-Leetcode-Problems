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
 public List<Integer> preorderTraversal(TreeNode root) {
     
    List<Integer> mainList = new ArrayList<Integer>();
    if(root == null) return mainList;
    
     Stack <TreeNode> stack = new Stack<>() ;
     
     stack.push(root) ;
     
     while(!stack.isEmpty()){
        
         root = stack.pop();
         mainList.add(root.val) ;
         
         if(root.right != null) stack.push(root.right);
         if(root.left != null) stack.push(root.left);
        
        
     }
     
     return mainList ;  
        
    }
}