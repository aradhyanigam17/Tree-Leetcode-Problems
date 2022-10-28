class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1 ;
        }
        
        Map<Character, Integer> map = new HashMap<>() ;
        
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch) + 1);
                
            }   
            
            else map.put(ch,1) ;
        }
        
        int len = 0 ;
        boolean odd = false ;
        for(int count : map.values())
        {
            if(count % 2 == 0 ) len += count ;
            else {
                if(!odd){
                    odd = true ;
                    len += count ;
                }
                else {
                    len += count - 1 ;
                }
                
            }
        }        
        
       
        return len ;
    }
}