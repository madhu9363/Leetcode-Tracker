// Last updated: 09/07/2026, 15:11:45
class Solution {
    public int titleToNumber(String cl) {
        int result =0;
        for(int i =0;i<cl.length();i++){
            result = (result*26) + (cl.charAt(i)-'A' +1);
        }
        return result;
        
    }
}