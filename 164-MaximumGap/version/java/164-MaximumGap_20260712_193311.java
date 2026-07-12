// Last updated: 12/07/2026, 19:33:11
1class Solution {
2    public int maximumGap(int[] nums) {
3        if(nums.length < 2) {
4            return 0;
5        }
6
7        Arrays.sort(nums);
8
9        int diff = 0;
10
11        for(int i=1; i<nums.length; i++) {
12            diff = Math.max(diff, nums[i] - nums[i-1]);
13        }
14
15        return diff;
16    }
17} 