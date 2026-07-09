// Last updated: 09/07/2026, 15:06:46
class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int even =0;
        int odd = 0;
        for (int num :nums1){
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        if(even==n||odd==n){
            return true ;
        }
        return true;
        
    }
}