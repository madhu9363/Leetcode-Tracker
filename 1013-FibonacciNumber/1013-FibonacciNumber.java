// Last updated: 09/07/2026, 15:09:45
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        for(int i =2;i<=n;i++){
            dp[0] =0;
            dp[1]= 1;
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}