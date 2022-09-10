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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>() ;
        
        if(root == null){
            return level ;
        }
        
        Queue<TreeNode> que = new LinkedList<>() ;
        
        que.offer(root);
        
        while(!que.isEmpty()){
            int levelNum = que.size() ;
            
            ArrayList<Integer> list =new ArrayList<>() ;
            
            for(int i = 0 ; i < levelNum ; i++){
                if(que.peek().left != null){
                    que.offer(que.peek().left);
                }
                
                if(que.peek().right != null){
                    que.offer(que.peek().right) ;
                }
                
                list.add(que.poll().val);
            }
            
            level.add(0,list) ;
        }
        
        return level ;
    }
}