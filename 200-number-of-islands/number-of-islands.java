class Solution {
    char[][] vis = new char[301][301];
    public boolean valid(int i,int j,char[][] grid)
    {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'; 
    }
    // to traverse nodes, it marks connected nodes as an island
    public void dfs (char[][] grid , int i , int j)
   
    {
        if( ! valid(i,j,grid) || vis[i][j] ==1 )
            return;
        vis[i][j] =1 ;
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);


    }
    public int numIslands(char[][] grid) {
        int ans = 0;
        for ( int i =0 ; i <grid.length;i++)
        {
            for(int j = 0 ; j<grid[0].length;j++)
                {
                    if( vis[i][j] ==0 && grid[i][j] =='1')
                        {
                            dfs ( grid,i,j);
                            ans++;
                        }
                }
        }

        return ans;
    }
}