// Last updated: 09/07/2026, 15:10:39
class Solution {
    public boolean isPerfectSquare(int num) {
        // long i =0;
        // long j = num-1;
        // while(i<=j){
        //     long mid =(int) (i+j)/2;
        //     if(mid*mid==num){
        //         return true;
        //     }else if(mid *mid>num){
        //         j = mid-1;
        //     }else {
        //         i= mid+1;
        //     }
        // }
        // if(num==1) return true;
        // return false;
        long s= (int)Math.sqrt(num);
        if(s*s==num){
            return true;
        }
        return false;
    }
}