class Solution {
    public boolean backspaceCompare(String s, String t) {

        ArrayList<Character> ss = new ArrayList<>() ;
        for(int i = 0 ;i < s.length() ;i++){
            if(ss.size() != 0 && s.charAt(i) == '#'){
                ss.remove(ss.size() - 1) ;
            }
            else {
                if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                    ss.add(s.charAt(i));
                }
            }
        }
        
        ArrayList<Character> tt = new ArrayList<>() ;
        for(int i= 0 ; i < t.length() ;i++){
           if(tt.size() != 0 && t.charAt(i) == '#'){
                tt.remove(tt.size() - 1) ;
            }
            else {
                if('a' <= t.charAt(i) && t.charAt(i) <= 'z') {
                    tt.add(t.charAt(i));
                }
            }
        }
        
        return ss.equals(tt) ;
    }
}