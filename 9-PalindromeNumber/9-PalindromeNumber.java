// Last updated: 09/07/2026, 15:13:31
class Solution {
    public boolean isPalindrome(int x) {
       int  original =x;
       int reversed = 0;
       if (x<0) return false;

        while (x!=0){
            
            int last;
            last = x%10;
            reversed = reversed*10+last;
            x =x/10;
        }
        return original == reversed;
    }
};