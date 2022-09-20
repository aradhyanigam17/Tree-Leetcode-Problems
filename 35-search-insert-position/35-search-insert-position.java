class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0 ;  
        int end = nums.length - 1 ;
        
        return rec(nums,target,start,end);
    }
    
    public int rec(int[] nums , int target , int start ,int end){
        while(start <= end){
             int mid = start + (end - start) / 2  ;
            
            if(nums[mid] == target){
                return mid ;
            }
            
            else if(nums[mid] < target){
                return rec(nums ,target,mid + 1,end) ;
            }
            else {
                return rec(nums,target,start,mid - 1) ;
            }
        }
        return start ;
    }
}