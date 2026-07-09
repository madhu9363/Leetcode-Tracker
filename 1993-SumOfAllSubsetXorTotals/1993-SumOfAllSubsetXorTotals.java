// Last updated: 09/07/2026, 15:08:37
class Solution {
    public int subsetXORSum(int[] nums) {
        int total =0;
        for(int num :nums){
            total |= num;
        }
        return total*(1 <<(nums.length-1));
    }
}