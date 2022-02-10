
//   public class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode() {}
//       TreeNode(int val) { this.val = val; }
//       TreeNode(int val, TreeNode left, TreeNode right) {
//             this.val = val;
//             this.left = left;
//             this.right = right;
//         }
//     }

   class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       
        List<Integer> mainList = new ArrayList<>() ;
        
        if(root == null) return mainList ;
        
        Stack<TreeNode> stack1 = new Stack<>() ;
        Stack<TreeNode> stack2 = new Stack<>() ;
        
        stack1.push(root) ;
        
        while(!stack1.isEmpty()){
            root = stack1.pop() ;
            stack2.push(root);
            
            if(root.left != null) stack1.push(root.left);
            if(root.right != null) stack1.push(root.right) ;
            
        }
        
        while(!stack2.isEmpty()){
            mainList.add(stack2.pop().val);
        }
        return mainList ;
    }
       
}