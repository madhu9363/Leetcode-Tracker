// Last updated: 09/07/2026, 15:08:03
class Solution {
    public int countDigits(int num) {
        int org = num;
        int count =0;
        while(num!=0){
            
            int last = num%10;
            if(org%last==0)
                count++;
                num = num/10;
        }
        return count;
        
    }
}