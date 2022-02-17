class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
        }
        
        int[] farr;
          if(k != 1) {
              int[] narr = new int[arr.length * 2];
              for(int i = 0, j = arr.length; i < arr.length; i++, j++) {
                  narr[i] = arr[i];
                  narr[j] = arr[i];
              }
              farr = narr;
          }else
              farr = arr;

          long cs = farr[0];   	// Current Sum
          long ans = farr[0];

          for(int i = 1; i < farr.length; i++) {
              if(cs >= 0)
                  cs = cs + farr[i];
              else
                  cs = farr[i];

              if(ans < cs)
                  ans = cs;
          }

          if(k == 1)
              return (ans % (Math.pow(10, 9) + 7)) > 0 ? (int)(ans % (Math.pow(10, 9) + 7)) : 0;
          else if(sum <= 0)
              return ans > 0 ? (int)(ans % (Math.pow(10, 9) + 7)) : 0;
          else{
              ans = ans + (k-2) * sum;
              return (int)(ans % (Math.pow(10, 9) + 7));
          }
        }
}