class Solution {
public int removeElement(int[] nums, int val) {
    int x =0;
    int y = 0;
    int count = 0;
    while(y < nums.length){
        if(nums[y] != val){
            nums[x] = nums[y];
            count++;
            x++;
        }
        y++;
    }
    return count;
}
}