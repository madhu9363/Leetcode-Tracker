// Last updated: 09/07/2026, 15:08:15
class Solution {
    public int minimumSum(int num) {
        int[] d = new int[4];
        for(int i =0;i<4;i++){
            d[i] = num%10;
            num/=10;
        }
        Arrays.sort(d);
        int num1 = d[0]*10+d[2];
        int num2= d[1]*10+d[3];
        return num1+num2;
    }
}