class Solution {
    public int climbStairs(int n) {
        if(n <= 3){
            return n ; 
        }
        int[] storage = new int[n + 1] ;
        
        for(int i = 0 ;i <= n ;i++){
            if(i <= 3){
                storage[i] = i ;
            }
            
            else storage[i] = storage[i - 1] + storage[i - 2] ;
        }
        
        return storage[n] ;     
    }
}