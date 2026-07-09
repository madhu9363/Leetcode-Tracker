// Last updated: 09/07/2026, 15:11:51
class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}