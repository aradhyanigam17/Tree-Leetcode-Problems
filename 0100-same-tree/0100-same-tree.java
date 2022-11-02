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
    public boolean isSameTree(TreeNode p, TreeNode q) {
       
        
        if(p == null && q == null){
            return true ;
        }
        
        if(p == null ){
            return false ;
        }
        if(q == null){
            return false ;
        }
        
        List<Integer> listp = preorder(p) ;
        List<Integer> listq = preorder(q) ;
        
        
        return listp.equals(listq) ;
    }
    
    
    public List<Integer> preorder(TreeNode node){
        if(node == null){
            return null; 
        }
        
        ArrayList<Integer> pre = new ArrayList<>() ;
        
        preOrder(node , pre) ;
        
        return pre ;
    }
    
    
    public void preOrder(TreeNode node , ArrayList<Integer> list ){
        if(node == null){
            list.add(0) ;
            return  ;
        }
        
        list.add(node.val) ;
        preOrder(node.left, list) ;
        preOrder(node.right,list) ;
    }
}