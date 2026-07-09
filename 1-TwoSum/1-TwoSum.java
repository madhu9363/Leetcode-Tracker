// Last updated: 09/07/2026, 15:13:42
class Solution {
    public int[] twoSum(int[] num, int target) {
        int sum =0;
        int n = num.length;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]+num[j] == target){
                    return new int [] {i,j};
                }
            }
        }
        return new int [] {};
        
        
    }
}