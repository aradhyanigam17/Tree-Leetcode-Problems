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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> mainList = new ArrayList<Integer>() ;
        
        if(root == null) return mainList ;
        
        Stack <TreeNode> stack1 = new Stack<>() ;
        
        TreeNode current = root ; // going to travel through all left nodes 
        
        while(current != null || !stack1.isEmpty()){
            
            if(current != null){
                stack1.push(current) ;
                current = current.left ;
                
            }
            
            else{
                TreeNode temp = stack1.peek().right ;
                
                if(temp == null){
                    temp = stack1.pop();
                    mainList.add(temp.val) ;
                    while(!stack1.isEmpty() && temp == stack1.peek().right){
                        temp = stack1.pop();
                        mainList.add(temp.val) ;
                        
                    }
                }
                else current = temp ;
            }
            
        }
        return mainList ;
    }
}