// Last updated: 09/07/2026, 15:13:41
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxlen =0;
        int left =0;
        for(int i =0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxlen = Math.max(maxlen,i-left+1);
        }
        
        return maxlen;
    }
}