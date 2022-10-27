class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0 ;
        int min = Integer.MAX_VALUE ;
        int maxDiff = Integer.MIN_VALUE ;
        
        for(int i = 0 ; i < prices.length ;i++){
            min = Math.min(min , prices[i]) ;
            maxDiff = Math.max(prices[i] - min , maxDiff) ;
        }
        return maxDiff ;
    }
}