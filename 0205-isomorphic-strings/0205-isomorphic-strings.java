class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        // Create two maps for s & t strings...
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        // Traverse all elements through the loop...
        for(int idx = 0; idx < s.length(); idx++){
            // Compare the maps, if not equal, return false...
            if(map1[s.charAt(idx)] != map2[t.charAt(idx)])
                return false;
            // Insert each character if string s and t into seperate map...
            map1[s.charAt(idx)] = idx + 1;
            map2[t.charAt(idx)] = idx + 1;
        }
        return true;
    }
}