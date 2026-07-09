// Last updated: 09/07/2026, 15:06:39
class Solution {
    public int minimumSwaps(int[] nums) {
        int zerocount =0;
        for(int num:nums){
            if(num==0){
                zerocount++;
            }
        }
        int swap =0;
        int limt=nums.length-zerocount;

        for(int i=0;i<limt;i++){
            if(nums[i]==0){
                swap++;
            }
        }
        return swap;
    }
}