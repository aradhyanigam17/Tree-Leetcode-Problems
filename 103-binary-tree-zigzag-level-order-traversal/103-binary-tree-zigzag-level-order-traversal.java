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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> mainList = new LinkedList<List<Integer>>() ;
        
        if(root == null) return mainList ;
        boolean leftToRight = true  ;
        Queue<TreeNode> q = new LinkedList<>() ;
        
        q.offer(root);
      while(!q.isEmpty()){
           
           int level = q.size();
           List<Integer> sublist = new ArrayList<Integer>();
           
            for(int i = 0 ; i < level ; i++){
               
             if(q.peek().left != null) q.offer(q.peek().left);
             if(q.peek().right != null) q.offer(q.peek().right) ;
                
            if(leftToRight) sublist.add(q.poll().val);
            else sublist.add(0 , q.poll().val);
           }
          leftToRight = !leftToRight ;
          mainList.add(sublist);
        }
     return mainList ;
    }
}