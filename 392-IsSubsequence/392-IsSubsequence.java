// Last updated: 09/07/2026, 15:10:35
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i =0;
        for(int j =0;j<t.length();j++){
            if(i<s.length()&&s.charAt(i)==t.charAt(j)){
                i++;
            }
            
        }
        return i==s.length();
    }
}