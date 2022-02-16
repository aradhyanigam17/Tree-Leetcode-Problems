```
public List<Integer> rightSideView(TreeNode root) {
List<Integer> list = new LinkedList<Integer>() ;
if(root == null) return list ;
TreeMap<Integer , TreeMap<Integer,Integer>> map = new TreeMap<>() ;
Queue<Pair2> q = new LinkedList<>() ;
q.add(new Pair2(0  ,0, root));
while(!q.isEmpty()){
Pair2 it = q.remove() ;
int x = it.x ;
int y = it.y ;
TreeNode node = it.node ;
if(!map.containsKey(x)) {
map.put(x , new TreeMap<Integer ,Integer>());
}
if(!map.get(x).containsKey(y)){
map.get(x).put(y , node.val);
}
map.get(x).put(y , node.val);
if(node.left != null){
q.add(new Pair2(x - 1 , y + 1 ,node.left));
}
if(node.right != null){
q.add(new Pair2(x + 1 , y + 1 , node.right));
}
}
for(TreeMap<Integer,Integer> e : map){
list.add(e.values());
}
return list;
}
```