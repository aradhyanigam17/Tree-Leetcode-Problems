Prev
```
/**
* Definition for a binary tree node.
* public class TreeNode {
*     int val;
*     TreeNode left;
*     TreeNode right;
*     TreeNode() {}
*     TreeNode(int val) { this.val = val; }
*     TreeNode(int val, TreeNode left, TreeNode right) {
*         this.val = val;
*         this.left = left;
*         this.right = right;
*     }
* }
*/
class Solution {
public ArrayList<String> flatten(TreeNode root) {
ArrayList<Integer> preorder =new ArrayList<>();
preorder(root,preorder) ;
System.out.println(preorder);
ArrayList<String> ans = new ArrayList<>();
int i = 0 ;
while(i < preorder.size()-1){
ans.add(""+preorder.get(i));