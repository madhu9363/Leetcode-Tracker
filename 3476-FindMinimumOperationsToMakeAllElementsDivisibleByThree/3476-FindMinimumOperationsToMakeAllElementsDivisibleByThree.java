// Last updated: 09/07/2026, 15:07:28
class Solution {
    public int minimumOperations(int[] nums) {
        int sum =0;
        for(int x:nums){
            if(x%3!=0){
                sum++;
            }
          
        }
          return  sum;
        
    }
}