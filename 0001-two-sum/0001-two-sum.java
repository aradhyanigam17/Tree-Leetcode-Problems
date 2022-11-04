class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer , Integer> map = new HashMap<>() ; 
       
        
        for(int i = 0 ; i < nums.length ;i++){
            int check = target - nums[i] ;
            if(map.containsKey(check)){
                return new int[]{i , map.get(check)} ;
            }
            else map.put(nums[i] , i) ;
        }
        
        return new int[]{-1,-1} ;
    }
}