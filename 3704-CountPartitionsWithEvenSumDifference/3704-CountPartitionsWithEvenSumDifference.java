// Last updated: 09/07/2026, 15:07:20
class Solution {
    public int countPartitions(int[] nums) {
        int totalsum =0;
        for(int i : nums)
            totalsum += i;
        int cs =0;
        int count=0;
        for(int i =0;i<nums.length-1;i++){
            cs += nums[i];
            totalsum -= nums[i];
            if((totalsum -cs) %2==0) count ++;
        }
        return count;
        
    }
}