// Last updated: 09/07/2026, 15:07:03
class Solution {
    public int mirrorDistance(int n) {
        int org = n;
        int rev =0;
        while(n!=0){
            int last = n%10;
            rev = rev * 10+last;
            n/=10;
        }
        return Math.abs(org-rev);
    }
}