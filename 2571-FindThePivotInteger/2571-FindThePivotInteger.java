// Last updated: 09/07/2026, 15:08:06
class Solution {
    public int pivotInteger(int n) {
        int total=(n*(n+1))/2;
        int s = (int)Math.sqrt(total);
        if(s*s == total) return s;
        return -1;

        
     
        
    }
}