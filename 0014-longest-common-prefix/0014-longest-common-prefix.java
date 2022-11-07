class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        if(strs.length == 1){
            return strs[0] ;
        }
        String result = "" ;
        for(int i = 0 ; i < strs[0].length() ;i++){
            char ch = strs[0].charAt(i) ;
            boolean flag = true ;
            
            for(int j = 0 ; j < strs.length ;j++){
                if(strs[j].length() <= i){
                    flag = false ;
                    break ;
                }
                if(strs[j].charAt(i) != ch){
                    flag = false ;
                    break ;
                }
            }
            if(!flag){
                return result ;
            }
            else {
                result += ""+ch ;
            }
        }
        return result ;
    }
}