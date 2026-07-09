// Last updated: 09/07/2026, 15:07:26
class Solution {
    public String winningPlayer(int x, int y) {
        int trune= Math.min(x,y/4);
        if(trune%2==0)
        return "Bob";
        else
        return "Alice";
        
    }
}