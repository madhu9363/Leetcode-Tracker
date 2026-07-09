// Last updated: 09/07/2026, 15:09:04
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i] = start+2*i;
        }
        int rs =0;
        for(int num :nums){
            rs ^=num;
        }
        return rs;
    }
}