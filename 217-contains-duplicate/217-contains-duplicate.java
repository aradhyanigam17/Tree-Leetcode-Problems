class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        if(set.size() == nums.length) return false;
        return true;
    }
}