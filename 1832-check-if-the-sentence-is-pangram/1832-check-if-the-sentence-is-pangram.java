class Solution {
    public boolean checkIfPangram(String sentence) {
       Set<Character> set = new HashSet<>() ;;
        
        for(char ch : sentence.toCharArray()){
            set.add(ch);    
        }
        
        System.out.println(set.size()) ;
        return set.size() == 26 ;
    }      
}