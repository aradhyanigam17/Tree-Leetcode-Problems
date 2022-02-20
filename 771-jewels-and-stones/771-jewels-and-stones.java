class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelCount=0;
        for(int i=0;i<jewels.length();i++){
            char jewelPart= jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                if(jewelPart == stones.charAt(j)){
                    jewelCount++;
                }
            }
        }
        return jewelCount;
    }
}