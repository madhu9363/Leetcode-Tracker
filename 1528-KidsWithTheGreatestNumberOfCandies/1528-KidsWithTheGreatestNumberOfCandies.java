// Last updated: 09/07/2026, 15:09:11

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        // Step 1: find maximum candies
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        // Step 2: check each kid
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}