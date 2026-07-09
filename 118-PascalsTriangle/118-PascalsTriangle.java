// Last updated: 09/07/2026, 15:12:07
class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> dp = new ArrayList<>();
     for(int i =0;i<numRows;i++){
        List<Integer> curr = new ArrayList<>();
        for(int j =0;j<=i;j++){
            if(j==0||j==i){
                curr.add(1);
            }else{
                int left = dp.get(i-1).get(j-1);
                int right = dp.get(i-1).get(j);
                int result = (left+right);
                curr.add(result);
            }
            
        }
        dp.add(curr);
     }   
     return dp;
    }
}