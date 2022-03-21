class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        helper(root);
        return root;      
        
    }
    
    public void helper(TreeNode node) {
	// Don't do anything and return if 'null' is encountered.
        if(node == null) {
            return;
        }
		// Swapping children of every single node.
		
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
		// Swapping at current level is done....
		// Now... my warriors.... go and swap the deeper nodes.... =D
        helper(node.left);
        helper(node.right);       
    }
}