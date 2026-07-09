// Last updated: 09/07/2026, 15:12:28
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i =0;
        int j = n-1;
        while(i<m &&j>=0){
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]> target){
                j--;
            }else{
                i++;
            }

        }
        return false;
    }
}