// Last updated: 09/07/2026, 15:06:59
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> onblubs = new HashSet<>();
        for(int blub:bulbs){
            if(onblubs.contains(blub)){
                onblubs.remove(blub);
            }else{
                onblubs.add(blub);
            }
                
        }
        List<Integer>result = new ArrayList<>(onblubs);
        Collections.sort(result);
        return result;
        
    }
}