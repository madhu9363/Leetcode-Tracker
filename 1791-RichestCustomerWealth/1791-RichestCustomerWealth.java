// Last updated: 09/07/2026, 15:08:51
class Solution {
    public int maximumWealth(int[][] accounts) {
        int result =0;
        for(int[] cus:accounts){
            int sum =0;
            for(int money:cus){
                sum+=money;
            }
            if(sum >result){
                result = sum;
            }
        }
        return result;
    }
}