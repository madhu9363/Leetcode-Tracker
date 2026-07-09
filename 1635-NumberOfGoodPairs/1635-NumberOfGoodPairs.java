// Last updated: 09/07/2026, 15:09:01
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int sum =0;
        HashMap <Integer,Integer> freq = new HashMap<>();
        for(int i =0;i<nums.length;i++){
          sum += freq.getOrDefault(nums[i],0);
          freq.put(nums[i],freq.getOrDefault(nums[i], 0)+1);
        }
        return sum;
        
        
    }
}