// Last updated: 09/07/2026, 15:09:28
class Solution {
    public int minCostToMoveChips(int[] position) {
               int evencount =0;
        int oddcount =0;
        for(int x:position){
            if(x%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        return  evencount<oddcount? evencount:oddcount;
        
    }
}