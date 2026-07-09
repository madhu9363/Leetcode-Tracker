// Last updated: 09/07/2026, 15:06:44
class Solution {
    public boolean uniformArray(int[] nums1) {
        int[] arr = nums1;
        Arrays.sort(nums1);
        int min = nums1[0];
        if(min%2==1){
            return true;
        }
        for(int num:nums1){
            if(num%2!=0){
                return false;
            }
        }
        return true;
        
    }
}