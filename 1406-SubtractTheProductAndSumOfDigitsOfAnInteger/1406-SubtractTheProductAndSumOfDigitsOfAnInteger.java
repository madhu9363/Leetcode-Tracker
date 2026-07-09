// Last updated: 09/07/2026, 15:09:25
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum =0;
        while(n!=0){
            int last;
            last = n%10;
            product = product * last;
            sum = sum+ last;
            n= n/10; 
        }
        return product - sum;
        
    }
}