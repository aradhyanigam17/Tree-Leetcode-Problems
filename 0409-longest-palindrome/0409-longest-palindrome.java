class Solution {
    public int longestPalindrome(String s) {
        int[] uppercase = new int[26] ; 
        int[] lowercase = new int[26] ;
        
        for(char ch : s.toCharArray()){
            if(ch - 97 >= 0){
                lowercase[ch - 97]++ ;
            }   
            else uppercase[ch - 65]++ ;
        }
        
        
        int count = 0 ;
        boolean odd = false ;
        
        for(int i = 0 ; i < uppercase.length ; i++){
            if(uppercase[i] % 2 == 0){
                count += uppercase[i] ; 
            } 
            else {
                odd = true ;
                count += uppercase[i] - 1 ;
            }
        }
        
         for(int i = 0 ; i < lowercase.length ; i++){
            if(lowercase[i] % 2 == 0){
                count += lowercase[i] ; 
            } 
            else {
                odd = true ;
                count += lowercase[i] - 1 ;
            }
        }
        
        if(odd){
            count += 1 ;
        }
        
        return count ;
    }
}