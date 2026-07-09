// Last updated: 09/07/2026, 15:10:54
class Solution {
public:
    int addDigits(int num) {
        while(num>=10){
            int sum =0;
            while(num!=0){
                sum+=num%10;
                num = num/10;
           }
            num= sum;
       }
        return num;
    }
};