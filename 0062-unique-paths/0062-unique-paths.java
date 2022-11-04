class Solution {
    public int uniquePaths(int m, int n) {
        int[][] storage = new int[m + 1][n + 1] ;
        return helper(m , n , 0 , 0 , storage) ;
    }
    
    public int helper(int m , int n,int r , int c,int[][] storage){
        if(r == m - 1 && c == n - 1){
            return 1 ;
        }
        
        if(r >= m || c >= n){
            return 0 ;
        }
        
        if(storage[r][c] != 0){
            return storage[r][c] ;
        }
        
        storage[r][c] =  helper(m , n , r + 1 , c,storage) + helper(m , n , r , c + 1,storage) ;
        
        return storage[r][c] ;
    }
}