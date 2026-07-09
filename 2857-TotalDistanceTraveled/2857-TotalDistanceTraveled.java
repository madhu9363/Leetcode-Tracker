// Last updated: 09/07/2026, 15:07:43
class Solution {
    public int distanceTraveled(int mt, int at) {
        int total =0;
        while(mt>=5){
            total+=50;
            mt-=5;
            if(at>=1){
                mt++;
                at--;
            }
        }
        return total+(mt*10);
        
    }
}