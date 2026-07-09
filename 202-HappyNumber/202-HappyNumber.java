// Last updated: 09/07/2026, 15:11:14
class Solution {
    public static int SumOfSquare(int n){
        int sum=0;
        while(n!=0){
        int digit =n%10;
        sum+= digit*digit;
        n=n/10;
        }
         return sum;
    }
   
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
        slow =SumOfSquare(slow);
        fast = SumOfSquare(SumOfSquare(fast));
        }while(slow!=fast);
        return slow ==1;
    }

}