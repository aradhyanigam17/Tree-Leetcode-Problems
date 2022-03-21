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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findTargetSum(root, targetSum, 0);
    }

    public static boolean findTargetSum(TreeNode node, int target, int currentSum) {
        if (node == null) {
            return false;
        }

        currentSum = currentSum + node.val;
        if (node.left == null & node.right == null) {
            if (currentSum == target) {
                return true;
            }
        }
        return findTargetSum(node.left, target, currentSum) || findTargetSum(node.right, target, currentSum);
    }
}