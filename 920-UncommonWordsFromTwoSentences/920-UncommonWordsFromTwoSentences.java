// Last updated: 09/07/2026, 15:09:48
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] first = s1.split(" ");
        String[] second = s2.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:first){
            map.put(word,map.getOrDefault(word,0)+1);
        }   
        for(String word: second){
            map.put(word,map.getOrDefault(word,0)+1);
        }     
        ArrayList<String> ans = new ArrayList<>();
        for(String word:map.keySet()){
            if(map.get(word)==1){
                ans.add(word);
            }
        }
        

        return ans.toArray(new String[0]);
    }
}