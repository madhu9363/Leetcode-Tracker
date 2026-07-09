// Last updated: 09/07/2026, 15:10:25
class Solution {
public:
    int hammingDistance(int x, int y) {
        int count =0;
        int c = x^y;
        while(c !=0){
            c=  c&c-1;
            count ++;
        }
        return count;
    }
};