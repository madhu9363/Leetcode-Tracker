// Last updated: 09/07/2026, 15:10:01
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int perfectSum = n * (n + 1) / 2;
        int actualSum = 0;
        int uniqueSum = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            actualSum += num;
            if (!set.contains(num)) {
                set.add(num);
                uniqueSum += num;
            }
        }
        
        int duplicate = actualSum - uniqueSum;
        int missing = perfectSum - uniqueSum;
        
        return new int[]{duplicate, missing};
    }
}
