// Last updated: 09/07/2026, 15:06:41
class Solution {
    public String trafficSignal(int t) {
        if(t==0){
            return "Green";
        }else if(t==30){
            return "Orange";
        }else if(t>30 && t<=90){
            return "Red";
        }else{
            return "Invalid";
        }
    }
}