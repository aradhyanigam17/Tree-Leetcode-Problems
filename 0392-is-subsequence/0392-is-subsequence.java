class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0){
            return true ;
        }
        
         if(t.length() == 0){
             return false ;
         }
        
        int count = 0 ; 
        int j = 0 ;
        for(int i = 0 ; i < t.length() && j < s.length() ;i++){
            if(s.charAt(j) == t.charAt(i)) {
                j++ ;
                count++ ;
            }
            
            if(i == t.length() - 1 && count < s.length()) return false ;
        }   
        return count == s.length() ;
    }
}