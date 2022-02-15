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

class Coordinate{
    TreeNode node ;
    int x_axis ;
    int y_axis ;
    
    public Coordinate(TreeNode _node , int x ,int y){
        this.node = _node ;
        this.x_axis = x ;
        this.y_axis = y ;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Coordinate> queue = new LinkedList<>(); 
        // ArrayList cant be use there bcz it is compatible with it 
        
        queue.offer(new Coordinate(root,0,0));
        
        while(!queue.isEmpty()){
            Coordinate cor = queue.poll();
            
            TreeNode node = cor.node ;
            int x = cor.x_axis ;
            int y = cor.y_axis ;
            
            if(!map.containsKey(x)){
                map.put(x , new TreeMap<>());
            }
            
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y , new PriorityQueue<>());
            }
            
            map.get(x).get(y).offer(node.val); 
            //we are using offer function not put to add node value to PriorityQueue bcz it is a queue ....      
            
            if(node.left != null){
                queue.offer(new Coordinate(node.left ,x - 1 ,y + 1));
            }
            
            if(node.right != null){
                queue.offer(new Coordinate(node.right , x + 1 , y + 1));
            }
            
        }
        
        
        List<List<Integer>> list = new ArrayList<>() ;
        
        for(TreeMap < Integer, PriorityQueue<Integer> > mapValue : map.values()) {
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> que : mapValue.values()){
                while(!que.isEmpty()){
                    list.get(list.size() -1).add(que.poll());
                }
            }
        }
        return list ;
        
    }
}























