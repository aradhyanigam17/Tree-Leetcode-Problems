class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 1){
            return true ;
        }
        
        Map<Character,Character> map = new HashMap<>() ;
        
        for(int i = 0 ; i < s.length() ;i++){
            
            if(map.containsKey(s.charAt(i))){
                char ch = s.charAt(i) ;
                if(map.get(ch) != t.charAt(i)) {
                    return false;
                }
            }
            
            else if(map.containsValue(t.charAt(i))){
                return false ;
            } 

            else {
                map.put(s.charAt(i),t.charAt(i)) ;
            } 
        }
        return true ;
    }
}