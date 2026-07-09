// Last updated: 09/07/2026, 15:13:09
class Solution {
    public int divide(int dividend, int divisor) {
        int div= dividend/divisor;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
    return Integer.MAX_VALUE;
        return div;
    }
}