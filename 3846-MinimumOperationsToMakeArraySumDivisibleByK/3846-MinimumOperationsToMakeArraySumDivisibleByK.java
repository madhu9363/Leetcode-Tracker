// Last updated: 09/07/2026, 15:07:14
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        int ans = sum%k;
        return ans;
        
    }
}