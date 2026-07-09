// Last updated: 09/07/2026, 15:09:02
class Solution {
    public int countOdds(int low, int high) {
        int range =(high-low)+1;
        if(low%2==1 && high %2==1){
            return (range/2)+1;
        }
        return range/2;
      
    }
}