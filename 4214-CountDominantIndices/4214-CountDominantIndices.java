// Last updated: 09/07/2026, 15:06:57
class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int count =0;
        long total =0;
        
        for(int i =n-1;i>=0;i--){
            if(i <n-1){
              double avg = (double) total/(n-i-1);
               if(nums[i] > avg){
                 count++;
               }
            }
            total += nums[i];
        }
        return count;
    }
}