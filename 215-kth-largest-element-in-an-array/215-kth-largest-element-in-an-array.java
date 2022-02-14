class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> que = new PriorityQueue<>() ;
        
        for(int i = 0 ; i < k ; i++){
            que.add(nums[i]);
        }
        
        for(int i = k ; i < nums.length ; i++){
            if(que.peek() < nums[i]){
                que.poll();
                que.add(nums[i]);
            }
        }
        return que.peek() ;
   
    }
}