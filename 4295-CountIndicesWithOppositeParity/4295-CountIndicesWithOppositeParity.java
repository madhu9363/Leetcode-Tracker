// Last updated: 09/07/2026, 15:06:36
class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int oddcount = 0;
        int evencount =0;
        for(int i =n-1;i>=0;i--){
            if(nums[i]%2==0){
                answer[i]= oddcount;
                evencount++;
            }else{
                answer[i] = evencount;
                oddcount++;
            }
        }
        return answer;
    }
}