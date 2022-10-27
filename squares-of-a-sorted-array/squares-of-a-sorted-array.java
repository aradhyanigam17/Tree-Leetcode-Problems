class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums.length == 1){
            return new int[]{nums[0] * nums[0]} ;
        }
        
        for(int i = 0 ; i < nums.length ;i++){
            nums[i] = nums[i] * nums[i] ;
        }
        
        Arrays.sort(nums) ;
        
        return nums;
    }
}