// Last updated: 09/07/2026, 15:10:48
class Solution {
public:
    bool canWinNim(int n) {
        if(n==2) return true;
        if(n%4==0){
            return false;
        }else{
            return true;

        }
        
    }
};