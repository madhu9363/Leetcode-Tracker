// Last updated: 09/07/2026, 15:06:38
class Solution {
    public int sumOfPrimesInRange(int n) {
        int org = n;
        int r =0;
        int temp =n;
        while(temp>0){
            int last = temp%10;
            r = r*10+last;
            temp/=10;
        }
        int start = Math.min(org,r);
        int end = Math.max(org,r);
        int sum =0;
        for(int i =start;i<=end;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    private boolean isPrime(int num){
        if(num<=1) return false;
        for(int i =2;i*i<=num;i++){
            if(num %i==0) return false;
        }
        return true;
    }
}