// Last updated: 09/07/2026, 15:08:24
class Solution {
    public long interchangeableRectangles(int[][] rec) {
        long res =0;
        HashMap<Double,Integer> freq = new HashMap<>();
        for(int[] r :rec){
            double ratio = (double)r[0]/r[1];
            res = res+ freq.getOrDefault(ratio,0);
            freq.put(ratio, freq.getOrDefault(ratio,0)+1);
        }
        return res;

         
    }
}