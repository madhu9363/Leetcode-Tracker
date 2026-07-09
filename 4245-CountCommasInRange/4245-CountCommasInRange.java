// Last updated: 09/07/2026, 15:06:53
class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        return n-999;
    }
}