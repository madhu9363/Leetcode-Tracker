// Last updated: 09/07/2026, 15:07:46
class Solution {
    public int gcd(int a,int b){
            while(b!=0){
                int temp=a% b;
                a=b;
                b=temp;
                
            }
            return a;
        }
    public int countBeautifulPairs(int[] nums) {
        
        int count =0;
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int first = nums[i];
                while(first>=10){
                    first = first/10;
                }
                int sec = nums[j]%10;

                if(gcd(first,sec)==1){
                    count++;
                }
            }
        }
        return count;
    }
}