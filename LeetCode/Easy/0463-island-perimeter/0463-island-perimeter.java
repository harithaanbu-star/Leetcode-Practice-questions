class Solution {
    
    public int perimeter(int[][] grid,int r,int c,boolean [][] visited){
        if( r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0){
            return 1;
        }
        int peri=0;
        if(visited[r][c]) return 0;
        visited[r][c]=true;
        peri+=perimeter(grid,r-1,c,visited);
        peri+=perimeter(grid,r+1,c,visited);
        peri+=perimeter(grid,r,c+1,visited);
        peri+=perimeter(grid,r,c-1,visited);
        return peri;
    }
    public int islandPerimeter(int[][] grid) {
        boolean [][] visited = new boolean[grid.length] [grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   return perimeter(grid,i,j,visited); 
                }
            }
        }
        return 0;
    }
}