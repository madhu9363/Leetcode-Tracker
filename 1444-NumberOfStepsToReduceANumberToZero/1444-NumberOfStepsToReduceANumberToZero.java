// Last updated: 09/07/2026, 15:09:19
class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num %2==0){
                num = num/2;
            }else{
                num = num-1;
            }
            count++;
        } 
        return count;
        
    }
}