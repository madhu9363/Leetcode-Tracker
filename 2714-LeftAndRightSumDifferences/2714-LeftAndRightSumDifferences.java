// Last updated: 09/07/2026, 15:07:54
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalsum =0;
        int ans[] = new int[nums.length];
        for(int x: nums)   totalsum+=x;

        int leftsum =0;
        for(int i =0;i<nums.length;i++){
            int rigthsum = totalsum - leftsum -nums[i];
            ans[i] = Math.abs(leftsum-rigthsum);
            leftsum += nums[i];

        }
        return ans;
    }
}