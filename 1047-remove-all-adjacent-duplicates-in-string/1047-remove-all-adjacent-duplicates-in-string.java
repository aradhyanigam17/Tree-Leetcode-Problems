class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>() ;
        
        
        for(char ch : s.toCharArray()){
            if(stack.size() != 0 && stack.peek() == ch){
                stack.pop() ;
            }
            else stack.push(ch);
        }
        
        String out = "" ;
        
        while(!stack.isEmpty()){
            out = stack.pop() + out ;
        }
        
        return out ;
    }
}