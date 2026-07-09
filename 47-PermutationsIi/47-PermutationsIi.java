// Last updated: 09/07/2026, 15:12:53
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        permutations(0,nums);
        return ans;
    }
    void permutations(int i,int[] nums){
        if(i==nums.length-1){
            List<Integer> temp = new ArrayList<>();
            for(int k =0;k<nums.length;k++){
                temp.add(nums[k]);
            }
            ans.add(temp);

        }
        HashSet<Integer> map = new HashSet<>();

        for(int j =i;j<nums.length;j++){
            if(map.contains(nums[j])){
                continue;
            }
            map.add(nums[j]);
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            permutations(i+1,nums);
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
}