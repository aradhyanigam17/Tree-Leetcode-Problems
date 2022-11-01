class Solution {
    public int fib(int n) {
        int[] storage = new int[n + 1] ;
        
        return fibo(n , storage) ;
    }
    
    public int fibo(int n , int[] storage){
        if(n < 2){
            return n ;
        }
        
        if(storage[n] != 0){
            return storage[n];
        }
        
        
        storage[n] = fibo(n - 1 , storage) + fibo(n - 2 , storage) ;
        
        return storage[n] ;
    }
}