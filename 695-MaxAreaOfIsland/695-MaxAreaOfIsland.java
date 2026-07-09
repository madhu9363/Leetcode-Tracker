// Last updated: 09/07/2026, 15:09:58
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m =grid.length;
        int n = grid[0].length;
        boolean[][] visit = new boolean[m][n];
        int ans =0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1 &&visit[i][j]==false){
                    ans = Math.max(ans,bfs(i,j,visit,grid,m,n));
                }
            }
        }
        return ans;
    }
    int bfs(int i,int j,boolean[][] visit,int[][] grid,int m,int n){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        visit[i][j] = true;
         int area =1;
         int[][] dir ={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0){
           
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
           
            for(int k =0;k<4;k++){
                int nr = x+dir[k][0];
                int nc = y+dir[k][1];
                if(nr<m && nr>=0 && nc<n && nc>=0 && visit[nr][nc]==false && grid[nr][nc]==1){
                    q.add(new int[]{nr,nc});
                    visit[nr][nc] = true;
                    area++;
                }
            }
        } 
        return area;
    }
}