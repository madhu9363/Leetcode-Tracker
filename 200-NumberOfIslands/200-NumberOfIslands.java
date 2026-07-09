// Last updated: 09/07/2026, 15:11:16
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
        int ans =0;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]=='1'&& visit[i][j] == false){
                    ans++;
                    bfs(i,j,visit,grid,m,n);
                }
            }
        }
        return ans;
    }
    void bfs(int i, int j,boolean[][] visit,char grid[][],int m,int n){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visit[i][j] = true;
        while(q.size()>0){
            int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
            int curr[] = q.poll();
            int x = curr[0];
            int y = curr[1];
            for(int k =0;k<4;k++){
                int nextrow = x+dir[k][0]; 
                int nextcol = y+dir[k][1];
                if(nextrow < m && nextrow >=0 && nextcol < n && nextcol >=0 && visit[nextrow][nextcol]== false && grid[nextrow][nextcol]=='1'){
                    q.add(new int[]{nextrow,nextcol});
                    visit[nextrow][nextcol] = true;
                }
            }
        }
    }
}