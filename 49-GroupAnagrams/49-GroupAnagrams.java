// Last updated: 09/07/2026, 15:12:50
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs){
            char[] ans = word.toCharArray();
            Arrays.sort(ans);
            String stor = new String(ans);
            if (!map.containsKey(stor)) {
                map.put(stor, new ArrayList<>());
            }
            map.get(stor).add(word);
        }
        
        return new ArrayList<>(map.values());

        
    }
}