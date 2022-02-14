class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : nums){
            pq.add(val);
        }
        int max = 0;
        while(k > 0){
            max = pq.remove();
            k--;
        }
        return max;
   
    }
}