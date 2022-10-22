class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>() ;
        
        int[] ans = new int[2] ;
        
        for(int i = 0 ; i < nums.length ;i++){
            int want = target - nums[i] ;
            
            if(map.containsKey(want)){
                ans[0] = i ;
                ans[1] = map.get(want) ;
                break ;
            }
            
            else {
                map.put(nums[i] , i) ;
            }
        }
        // System.out.println(map) ;
        return ans; 
    }
}