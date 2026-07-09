// Last updated: 09/07/2026, 15:10:56
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> hm = new HashMap <>();
        for(char ch :s.toCharArray()){
           hm.put (ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch :t.toCharArray()){
           hm.put (ch,hm.getOrDefault(ch,0)-1);
        }
        for(int x:hm.values()){
            if(x!=0) return false;

        }
        return true;

        
    }
}