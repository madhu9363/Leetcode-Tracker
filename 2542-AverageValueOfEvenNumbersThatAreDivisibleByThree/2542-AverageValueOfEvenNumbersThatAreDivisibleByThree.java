// Last updated: 09/07/2026, 15:08:09
class Solution {
    public int averageValue(int[] num) {
        int count =0;
        int sum =0;
        for(int x:num){
            if(x%2==0 && x%3==0){
                sum = sum+x;
                count++;
            }
        }
        if(count>0){
            return sum/count;
        }else{
            return 0;
        }
    }
}