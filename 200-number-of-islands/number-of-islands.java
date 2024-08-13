class Solution {
    char[][] vis = new char[301][301];
    public boolean valid(int i,int j,char[][] grid)
    {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'; 
    }
    public void dfs (char[][] grid , int i , int j)
   
    {
        if( vis[i][j] ==1 )
            return;
        vis[i][j] =1 ;
        if(valid(i,j+1,grid)) dfs(grid,i,j+1);
        if(valid(i,j-1,grid)) dfs(grid,i,j-1);
        if(valid(i+1,j,grid)) dfs(grid,i+1,j);
        if(valid(i-1,j,grid)) dfs(grid,i-1,j);
        System.out.println("Hi");


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