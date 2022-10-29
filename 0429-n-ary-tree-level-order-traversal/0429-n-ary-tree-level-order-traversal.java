/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> level = new ArrayList<>() ;
        
        if(root == null){
            return level ;
        }
        
        Queue<Node> que = new LinkedList<>() ;
        
        que.offer(root) ;
        
        
        while(! que.isEmpty()){
            int levelsize = que.size() ;
            
           
            
            ArrayList<Integer> inner = new ArrayList<>() ;
            
            for(int i = 0 ; i < levelsize ;i++){
                
                 Node node = que.poll() ;
                int size = node.children.size() ;
                for(int j = 0 ;j < size ;j++){
                    if(node.children.get(j) == null){
                        break ;
                    }
                    else {
                        que.offer(node.children.get(j)) ;
                    }
                     
                }
                inner.add(node.val) ;
            }
            
            level.add(inner) ;
        }
        
        return level ;
    }
}