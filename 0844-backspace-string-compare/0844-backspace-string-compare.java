class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> list1 = new ArrayList<>() ;
        ArrayList<Character> list2 = new ArrayList<>() ;
        

        for(char ch : s.toCharArray()){
            if(list1.size() != 0 && ch == '#'){
              list1.remove(list1.size() - 1) ;
            }
            else {
                if(ch >= 'a' && ch <='z') list1.add(ch) ;
            }
        }

        for(char ch : t.toCharArray()){
            if(list2.size() != 0 && ch == '#'){
              list2.remove(list2.size() - 1) ;
            }
            else {
                if(ch >= 'a' && ch <='z') list2.add(ch) ;
            }
        }

        return list1.equals(list2) ;
    }
}