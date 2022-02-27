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

// approach 3


class Solution{
    public void flatten(TreeNode root){
        if(root == null) return ;
        
        TreeNode cur = root ;
        
            while(cur != null){

                if(cur.left != null){
                    TreeNode prev = cur.left ;

                    while(prev.right != null){
                        prev = prev.right ;
                    }

                    prev.right = cur.right ;
                    cur.right = cur.left ;

                    cur.left = null ;

                }
                cur = cur.right ;

            }
    }
}

/* // iterative 
    //2ms
class Solution {
    
    public void flatten(TreeNode root){
         if(root == null) return; 
        
        Deque<TreeNode> st = new ArrayDeque<>(); 
        st.push(root); 
        while(!st.isEmpty()) {
            TreeNode cur = st.pop();
            
            
            if(cur.right != null) {
                st.push(cur.right); 
            }
            if(cur.left != null) {
                st.push(cur.left); 
            }
            if(!st.isEmpty()) {
                cur.right = st.peek(); 
            }
            cur.left = null;
         }
    }
    
}
*/

/* //Recursive approach 
    // 0ms 
class Solution {
    TreeNode prev = null ;
    public void flatten(TreeNode root) {
        if(root == null) return ;
        
        flatten(root.right);
        flatten(root.left) ;
        
        root.right = prev ;
        root.left = null ;
        
        prev = root ;
    }
}

*/