class Solution {
    int curarea;
    public void dfs(int row,int col,int[][] grid,boolean [][] visited){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length ) return;
        if(grid[row][col] ==0) return;
        if(visited[row][col])  return;
        curarea++;
        visited[row][col]=true;
        dfs(row+1,col,grid,visited);
        dfs(row-1,col,grid,visited);
        dfs(row,col+1,grid,visited);
        dfs(row,col-1,grid,visited);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid,visited);
                    maxarea=Math.max(maxarea,curarea);
                    curarea=0;
                }
            }
        }
        return maxarea;
    }
}