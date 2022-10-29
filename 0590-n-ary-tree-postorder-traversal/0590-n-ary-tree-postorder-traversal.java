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
    public List<Integer> postorder(Node root) {
                
        List<Integer> post = new ArrayList<>() ;
        
        if(root == null){
            return post ;
        }
        
        postAdd(root , post) ;
        
        return post ;
    }
    
    public void postAdd(Node node , List<Integer> list){
        if(node == null){
            return ;
        }
        
        for(int i= 0 ; i < node.children.size() ;i++){
            postAdd(node.children.get(i), list) ;
        }
        
        list.add(node.val) ;
    }
}