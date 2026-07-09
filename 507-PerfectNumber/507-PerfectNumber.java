// Last updated: 09/07/2026, 15:10:20
class Solution {
    public boolean checkPerfectNumber(int n) {
        int org = n;
        int sum =0;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                sum =sum+i;
            }
            
        }
        return (org == sum) ? true:false;
    }
}