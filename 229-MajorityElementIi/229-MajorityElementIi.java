// Last updated: 09/07/2026, 15:11:01
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length;
        List <Integer> ans = new ArrayList<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int m = n/3;
        for(Map.Entry <Integer,Integer> en: map.entrySet()){
            if(en.getValue()>m){
                ans.add(en.getKey());

            }
        }
        return ans;
    }
}