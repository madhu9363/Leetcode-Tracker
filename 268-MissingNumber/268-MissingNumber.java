// Last updated: 09/07/2026, 15:10:51
class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        int n = nums.length;
        for(int x:nums){
            sum = sum+x;
        }
        int total = n*(n+1)/2;
        return total - sum;
        
    }
}