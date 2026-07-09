// Last updated: 09/07/2026, 15:12:42
class Solution {
    public int[][] merge(int[][] intervals) {
        // Arrays.sort(intervals);
        // for(int i =0;i<intervals.lenght;i++){
        //     for(int j = i+1;j<intervals.lenght;j++){
        //         int num = intervals[i][1];
        //         int q= intervals[j][0];
        //         if(num>q){
        //             int merge = interval[i][0]+interval[j][1];

        //         }else{

        //         }
        //     }
        // }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]>merge = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]= Math.max(prev[1],intervals[i][1]);
            }else{
                merge.add(prev);
                prev= intervals[i];
            }
        }
        merge.add(prev);
        return merge.toArray(new int[merge.size()][]);
    }
}