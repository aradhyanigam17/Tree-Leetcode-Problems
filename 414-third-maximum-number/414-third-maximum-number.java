class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>() ;
      
        for(int num : nums){
            set.add(num) ;
        }
      
        Object [] arr = set.toArray() ;
        if(arr.length < 3){
            return (int)arr[arr.length - 1] ;
        }
        return (int) arr[arr.length - 3] ;
         
    }
}