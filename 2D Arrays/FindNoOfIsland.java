class Solution {
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public int countIslands(char[][] grid) {
        // Code here
      int count = 0;
      int n = grid.length;
      int m = grid[0].length;
      
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              if(grid[i][j] =='L'){
                  dfs(grid,i,j,n,m);
                  count++;
              }
          }
      }
      return count;
    }
    public static void dfs(char[][] grid,int i, int j, int n, int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]!='L') return;
        
            grid[i][j] = 'W';
        for(int d=0;d<8;d++){
            dfs(grid, i+dx[d],j+dy[d],n,m);
        }
    }
}
