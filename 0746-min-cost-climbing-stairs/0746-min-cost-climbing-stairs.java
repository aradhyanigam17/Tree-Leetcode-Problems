class Solution {
    
    public int minCostClimbingStairs(int[] cost){
          int n = cost.length;
          if(n == 0){
              return cost[0] ;
          }
        
        if(n == 1){
            return cost[1] ;
        }
        
        int[] storage = new int[n + 1] ;
        storage[0] = cost[0] ;
        storage[1] = cost[1] ;
        
        for(int i = 2 ; i < n ; i++){
            storage[i] = cost[i] + Math.min(storage[i - 1] , storage[i - 2]);
        }
        
        return Math.min(storage[n - 1] , storage[n - 2]) ;
        
    }

    /*
     public int minCostClimbingStairs(int[] cost){
         
         int n = cost.length ;
        int[] storage = new int[cost.length + 1] ;   
        
        int ans = Math.min(helper(n - 1 , cost , storage) , helper(n - 2 , cost , storage)) ;
         
         return ans ;
            
     }
    
    public int helper(int n , int []cost ,int[] storage) {
        if(n == 0){
            return cost[0] ;
        }
        
        if(n ==1){
            return cost[1] ;
        }
        
        if(storage[n] != 0){
            return storage[n] ;
        }
        
        storage[n] = cost[n] + Math.min(helper(n - 1,cost,storage) , helper(n - 2 , cost ,storage));
        return storage[n] ;
    }
    */
    
   /*
   public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        
        int ans = Math.min(helper( n - 1,cost)  , helper(n - 2, cost)) ;
        
        return ans ;
    }
    
    public int helper(int n , int[]cost){
        if(n == 0){
            return cost[0] ;
        }
        
        if(n == 1){
            return cost[1] ;
        }
        
        
        int ans = cost[n] + Math.min(helper(n - 1, cost) , helper(n - 2 ,cost)) ;
        
        return ans ;
    }
    */
}