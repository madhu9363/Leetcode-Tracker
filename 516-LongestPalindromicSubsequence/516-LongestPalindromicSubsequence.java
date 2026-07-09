// Last updated: 09/07/2026, 15:10:18
class Solution {
    public int longestPalindromeSubseq(String s) {
       
        int m = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans = helper(s, t, m,n,dp);
        return ans;
    }
    public int helper(String ch1,String ch2,int m,int n,int[][] dp){
        if(m==0||n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(ch1.charAt(m-1) == ch2.charAt(n-1)){
            return 1+ helper(ch1,ch2,m-1,n-1,dp);
        }
        int ans1 = helper(ch1,ch2,m-1,n,dp);
        int ans2 = helper(ch1,ch2,m,n-1,dp);
        dp[m][n]= Math.max(ans1,ans2);
        return dp[m][n];
    }
}