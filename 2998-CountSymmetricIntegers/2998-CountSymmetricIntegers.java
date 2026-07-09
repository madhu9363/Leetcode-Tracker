// Last updated: 09/07/2026, 15:07:36
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count =0;
        for(int i =low;i<=high;i++){
            String num = String.valueOf(i);
            if(num.length()%2!=0){
                continue;
            }
            int sum1 = 0;
            int sum2 = 0;
            int mid = num.length()/2;
            for(int j=0;j<mid;j++){
                sum1+=num.charAt(j)-'0';
            }
            for(int j =mid;j<num.length();j++){
                sum2+= num.charAt(j)-'0';
            }
            if(sum1==sum2){
                count++;
            }
        }
        return count;
    }
}