// Last updated: 09/07/2026, 15:12:09
class Solution {

    Integer[][] dp;

    public int numDistinct(String s, String t) {

        dp = new Integer[s.length()][t.length()];

        return solve(s, t, 0, 0);
    }

    public int solve(String s, String t, int i, int j) {

        // All characters of t are matched
        if (j == t.length()) {
            return 1;
        }

        // s is finished but t is not
        if (i == s.length()) {
            return 0;
        }

        // Already computed
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int count = 0;

        if (s.charAt(i) == t.charAt(j)) {

            // Take the character
            count += solve(s, t, i + 1, j + 1);

            // Skip the character
            count += solve(s, t, i + 1, j);

        } else {

            // Skip current character
            count += solve(s, t, i + 1, j);
        }

        dp[i][j] = count;

        return count;
    }
}