class Solution {
    public String addStrings(String num1, String num2) {
        ArrayList<Integer> sum = new ArrayList<>();
        
        int i = num1.length() - 1 ; 
        int j = num2.length() - 1 ;
        
        int carry = 0 ;
        
        while(i >= 0  && j >= 0){
            int value = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j)) + carry;
            
            if(value > 9){
                carry = value / 10 ;
            }
            else carry = 0 ;
            sum.add(value % 10) ;
            
            i--;
            j--;
        }
        
        while(i >= 0){
            int value = Character.getNumericValue(num1.charAt(i)) + carry;
            
            if(value > 9){
                carry = value / 10 ;
            }
            else carry = 0 ;
            sum.add(value % 10) ;
            
            i--;
            
        }
        
        while(j >= 0){
            int value =  Character.getNumericValue(num2.charAt(j)) + carry;
            
            if(value > 9){
                carry = value / 10 ;
            }
            else carry = 0 ;
            sum.add(value % 10) ;
            
           
            j--;
        }
        
        
        if(carry > 0){
            sum.add(carry);
        }
        
        String out = "" ;
        
        
        for(int num : sum){
            out ="" + num + out;
        }
        
        return out ;
        
    }
}