// User function Template for Java

class Solution {
      static int[] dx = {-1,0,1,0};
        static int[] dy = {0,1,0,-1};
    static char[][] fill(char mat[][]) {
        // code here
      
        int n =mat.length;
        int m = mat[0].length;
        boolean[][] visited = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            if(mat[i][0] == 'O') dfs(mat,visited,i,0,n,m);
            if(mat[i][m-1] == 'O') dfs(mat,visited,i,m-1,n,m);
        }
         for(int j=0;j<m;j++){
            if(mat[0][j] == 'O') dfs(mat,visited,0,j,n,m);
            if(mat[n-1][j] == 'O') dfs(mat,visited,n-1,j,n,m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 'O' && !visited[i][j]){
                    mat[i][j] = 'X';
                } 
            }
        }
        return mat;
    }
        
        public static void dfs(char[][] mat,boolean[][] visited, int i,int j, int n, int m){
            visited[i][j] = true;
            for(int d=0;d<4;d++){
                int ni = i+dx[d];
                int nj = j+dy[d];
                
                if(ni>=0 && nj>=0 && ni<n && nj<m && !visited[ni][nj] && mat[ni][nj] == 'O'){
                    dfs(mat,visited,ni,nj,n,m);
                }
            }
        }
}
