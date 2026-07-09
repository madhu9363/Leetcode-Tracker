// Last updated: 09/07/2026, 15:09:16
class Solution {
    public int maximum69Number (int num) {
         char[] digit = String.valueOf(num).toCharArray();

         for(int i =0;i<digit.length;i++){
            if(digit[i] == '6'){
                digit[i] = '9';
                break;
            }
        
         }
         return Integer .parseInt(new String(digit));

        
    }
}