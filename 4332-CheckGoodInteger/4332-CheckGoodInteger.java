// Last updated: 09/07/2026, 15:06:33
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum = 0;
        int squaresum =0;
        int org = n;
        while(n>0){
            int last = n%10;
            digitsum = digitsum +last;
            squaresum = squaresum +last*last;
            n/=10;
        }
        if(squaresum-digitsum>=50){
            return true;
        }
        return false;
    }
}