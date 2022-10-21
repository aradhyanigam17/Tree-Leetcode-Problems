class Solution {
    
    
    
    public int ans(int n , int[] arr){
        if(n <= 1) return n ;

        if(arr[n] != -1){
            return arr[n] ;  
        }
        
        arr[n] = ans(n - 1 , arr) + ans(n - 2 , arr) ;
        return arr[n] ;
    
    }
    
    
    public int fib(int n) {
        int[] arr = new int[n + 1] ;
        Arrays.fill(arr,-1) ;
        return ans(n , arr) ;
    }
}