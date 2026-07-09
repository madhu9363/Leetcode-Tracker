// Last updated: 09/07/2026, 15:10:38
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i =0; i<s.length();i++){
            int ind =s.charAt(i)-97;
            freq[ind]++;
        } 
         for(int i =0; i<s.length();i++){
            int ind = s.charAt(i)-97;
            if(freq[ind] == 1) return i;
        } 
        return -1;
        
    }
}