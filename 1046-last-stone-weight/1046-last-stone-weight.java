class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length ; i++) {
            maxheap.add(stones[i]);
        }
      while (maxheap.size()!=1){
          int x=maxheap.poll();
          int y=maxheap.poll();
          if(x!=y){
              maxheap.add(x-y);
          }
          else if(x==y){
              maxheap.add(0);
          }
      }
      
        return maxheap.poll();
    }
}