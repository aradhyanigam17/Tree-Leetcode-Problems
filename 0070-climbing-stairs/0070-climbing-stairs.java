class Solution{
    public int climbStairs(int n){
        if(n < 3){
            return n ;
        }
        
        int[] storage = new int[n + 1] ; 
        
        storage[0] = 0 ;
        storage[1] = 1 ;
        storage[2] = 2 ;
        
        for(int i = 3 ;i <= n ;i++){
            storage[i] = storage[i - 1] + storage[i - 2] ;
        }
        
        
        return storage[n] ;
    }
}

/*
class Solution {
    public int climbStairs(int n) {
          
        int[] storage = new int[n + 1] ;
        
        return helper(n , storage) ;
        
    }
    
    public int helper(int n , int[] storage){
        if(n < 3){
            return n ;
        }
        
        if(storage[n] != 0){
            return storage[n] ;
        }
        
        storage[n] = helper(n - 1 , storage) + helper(n - 2 , storage) ;
        
        return storage[n] ;
    }
}
*/



/*

class Solution {
    public int climbStairs(int n) {
          
        if(n < 3){
            return n ;
        }
        return climbStairs(n - 1) + climbStairs(n - 2) ;
        
    }
}

*/