// Last updated: 09/07/2026, 15:08:01
class Solution {
    public int differenceOfSum(int[] nums) {
        int sumdigit =0;
        int digitsum =0;
        for(int x:nums){
            sumdigit+= x;
            int temp = x;
            while(temp!=0){
                int last = temp%10;
                digitsum =digitsum + last;
                temp = temp/10;

            }

        }  
        return sumdigit - digitsum;      
    }
}