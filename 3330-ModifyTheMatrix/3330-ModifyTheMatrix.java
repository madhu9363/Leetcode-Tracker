// Last updated: 09/07/2026, 15:07:31
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] res = new int[n][m];
        for(int j =0;j<m;j++){
            int max = -1;
            for(int i =0;i<n;i++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
            for(int i=0;i<n;i++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }
}