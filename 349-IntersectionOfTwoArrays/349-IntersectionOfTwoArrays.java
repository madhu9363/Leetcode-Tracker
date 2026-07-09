// Last updated: 09/07/2026, 15:10:41
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num :nums1){
            map.add(num);
        }
        for(int nums:nums2){
            if(map.contains(nums)){
                res.add(nums);
                map.remove(nums);
            }
        }
        int[] ans = new int[res.size()];
        for(int i =0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}