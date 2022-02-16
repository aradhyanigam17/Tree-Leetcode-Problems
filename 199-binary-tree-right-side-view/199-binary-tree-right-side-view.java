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



    class Pair2{
        int x ;
        int y ;
        TreeNode node ;

        public Pair2(int xaxis , TreeNode nod){
            this.x = xaxis ;
          
            this.node = nod ;
        }

    }
    class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new LinkedList<Integer>() ;
            if(root == null) return list ;

            TreeMap<Integer,Integer> map = new TreeMap<>() ;

            Queue<Pair2> q = new LinkedList<>() ;

            q.add(new Pair2(0  , root));

            while(!q.isEmpty()){

                Pair2 it = q.remove() ;
                int x = it.x ;
                TreeNode node = it.node ;
                
                map.put(x , node.val);

                if(node.left != null){
                    q.add(new Pair2(x + 1 ,node.left));
                }
                if(node.right != null){
                    q.add(new Pair2(x + 1 , node.right));
                }
            }

            list.addAll(map.values());
            return list;
        }
    }
