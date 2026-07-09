// Last updated: 09/07/2026, 15:08:40
class Solution {
    public int arraySign(int[] nums) {
        int product = 0;
        for(int x:nums){
            if(x==0){
                return 0;
            }else if( x<0){
                product++;
            }
        }
        return (product %2==0)? 1 :-1;
          

        
    }
}