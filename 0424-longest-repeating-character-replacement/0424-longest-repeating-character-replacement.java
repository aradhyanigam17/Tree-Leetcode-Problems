class Solution {
    public int characterReplacement(String s, int k) {
         int[] freq = new int[26];
        char[] arr = s.toCharArray();
        int left = 0, right = 0;

        int maxLen = 0, mostFreq = 0;

        while (right < s.length()) {
            mostFreq = Math.max(mostFreq, ++freq[arr[right] - 'A']);
            int canBeReplaced = (right - left + 1) - mostFreq;

            if (canBeReplaced > k) {
                freq[arr[left++] - 'A']--;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}