// Last updated: 09/07/2026, 15:07:05
class Solution {
    public int absDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int largest =0;
        int smallest=0;
        for(int i =0;i<k;i++){
            smallest+=nums[i];
        }
        for(int i = n- k;i<n;i++){
            largest+=nums[i];
        }
        return Math.abs(largest - smallest);
    }
}