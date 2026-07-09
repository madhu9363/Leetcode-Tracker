// Last updated: 09/07/2026, 15:06:50
class Solution {
    public long countCommas(long n) {
        long  ne =n;
        long comma =0;
        long power =1000;
        while(power<=ne){
            comma += ne-power+1;
            power*=1000;
        }
        return comma;
    }
}