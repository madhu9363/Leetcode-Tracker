// Last updated: 09/07/2026, 15:11:09
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return nums[0];
        }
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        for(int i =0;i<n-1;i++){
            arr1[i]=nums[i];
        }
        for(int i=1;i<n;i++){
            arr2[i-1]= nums[i];
        }
        int[] dp1 = new  int [n];
        Arrays.fill(dp1,-1);
        int ans1 = helper(arr1,arr1.length-1,dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int ans2 = helper(arr2,arr2.length-1,dp2);
        return Math.max(ans1,ans2);
    }

    public int helper(int nums[],int i,int dp[]){
        if(i<0){
            return 0;                
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take = nums[i]+helper(nums,i-2,dp);
        int not = 0+helper(nums,i-1,dp);
        int result = Math.max(take,not);
        dp[i] = result;
        return dp[i];
        }
     
    
}