// Last updated: 09/07/2026, 15:12:26
class Solution {
    public void sortColors(int[] nums) {
        int zi =0;
        int it = nums.length-1;
        int i  =0;
        while(i<=it){
           if(nums[i]==0){
            int t = nums[zi];
            nums[zi++] = nums[i];
            nums[i++] = t;
         }else if(nums[i] ==1) i++;
         else{
            int t =nums[it];
            nums[it--] = nums[i];
            nums[i] =t;
         }
        }

        
    }
}