class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       for(int i = 0 ; i < nums.length - 1;i++){
           int check = target - nums[i] ;
           
           for(int j = i + 1 ; j < nums.length ; j++){
                if(check == nums[j]){
                    return new int[]{i , j} ;
                }    
           }
       }
        
        return new int[]{-1,-1} ;
    }
}