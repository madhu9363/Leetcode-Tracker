// Last updated: 09/07/2026, 15:09:35
class Solution {
    public int tribonacci(int n) {
        if(n<=0) return 0;

        int first =0;
        int second =1;
        int next = 1;

        for(int i =3; i<=n; i++){
            int ans = first+second +next;
           
            first = second;
            second =next;
            next = ans;
           
        }
        return  next;
    }
}