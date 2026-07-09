// Last updated: 09/07/2026, 15:09:13
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; 
        for(int i =0;i<nums.length;i++){
            int count =0;
            for(int j =0;j<nums.length;j++){
                if(j!=i &&nums[j] <nums[i]){
                    count++;
                }

            }
            ans[i] = count;
        }
        return ans;
    }
}