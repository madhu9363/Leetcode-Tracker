// Last updated: 09/07/2026, 15:06:43
class Solution {
    public int mirrorFrequency(String s) {
        int[] freq = new int[128];
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        boolean[] visited = new boolean[128];
        int result =0;
        for(char c:s.toCharArray()){
            if(visited[c]) continue;
            char mirror = getMirror(c);
            int f1 = freq[c];
            int f2 = freq[mirror];
            result +=Math.abs(f1-f2);
            visited[c] =true;
            visited[mirror] = true;
            
        }
        return result;
    }
    private char getMirror(char c){
        if(Character.isLetter(c)){
            return(char)('z'-(c-'a'));
        }else{
            return(char)('9'-(c-'0'));
        }
    }
}