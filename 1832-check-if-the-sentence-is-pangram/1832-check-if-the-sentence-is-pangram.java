class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26] ;
        
        for(char ch : sentence.toCharArray()){
            arr[ch - 97]++ ;
        }
        
        for(int i : arr){
            if(i == 0){
                return false ;
            }
        }
        
        return true ;
    }      
}