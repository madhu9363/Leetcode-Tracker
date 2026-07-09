// Last updated: 09/07/2026, 15:07:24
class Solution {
    public boolean canAliceWin(int[] num) {
        int sum0 =0;
        int sum1 = 0;
        int n = num .length;
        for(int i = 0;i<n;i++){
            if(num[i] <10){
                sum0 +=num[i];
            }else{
                sum1 += num[i];
            }
           
        }
          if(sum0!=sum1)
          return true;
          else
          return false;


        
    }
  
}