class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true ;
        }
        
        if(t.length() == 0 || t.length() < s.length()){
            return false ;
        }
        
        
        // int count = 0 ; 
        int j = 0 ; 
        
        for(int i = 0 ; i < t.length() ; i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j == s.length()){
                    return true ;
                }
            }    
        }
        
        return false ;
    }
}