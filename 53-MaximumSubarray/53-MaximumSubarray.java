// Last updated: 09/07/2026, 15:12:45
class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int mx= nums[0];
        for(int i =0;i<nums.length;i++){
            cs+= nums[i];
            if(cs>mx)
            mx = cs;
            if(cs<0)
            cs=0;

        }
        return mx;
        
    }
}