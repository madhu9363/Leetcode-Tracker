// Last updated: 09/07/2026, 15:08:59
class Solution {
    public int numWaterBottles(int nb, int ne) {
        return nb + (nb-1)/(ne-1);
        
    }
}