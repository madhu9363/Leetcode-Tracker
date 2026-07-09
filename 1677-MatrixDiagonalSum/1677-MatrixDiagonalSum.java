// Last updated: 09/07/2026, 15:08:56
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        int i =0;int j=0;
        for(int k = 0;k<n;k++){
            sum+=mat[i][j];
            i++;
            j++;
        }
         i =0;j = n-1;
        for(int k =0;k<n;k++){
            if(i!=j) sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
        
    }
}