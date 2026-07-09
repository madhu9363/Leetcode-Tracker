// Last updated: 09/07/2026, 15:12:51
class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                result[j][row-1-i] = matrix[i][j];
            }
        }
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                matrix[i][j]= result[i][j];
            }
        }
    }
}