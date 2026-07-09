// Last updated: 09/07/2026, 15:07:06
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        if (need1 == 0 && need2 == 0) return 0;
        long ts = 0;
        if (costBoth < (long)cost1 + cost2) {
            long c = Math.min(need1, need2);
            ts += c * (long)costBoth;
            need1 -= (int)c;
            need2 -= (int)c;
        }

        ts += (long)need1 * Math.min(cost1, costBoth);
        ts += (long)need2 * Math.min(cost2, costBoth);
        return ts;
    }
}