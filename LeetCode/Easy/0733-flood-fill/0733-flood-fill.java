class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        dfs(sr,sc,image,color,visited,image[sr][sc]);
        return image;
    }
    public void dfs(int row , int col , int[][] image ,int color ,boolean visited[][], int org){
        if(row<0 || row >=image.length || col<0 || col>= image[0].length)
        return ;
        if(image[row][col]!=org) return;
        if(visited[row][col]) return;
        visited[row][col]=true;
        image[row][col]=color;
        dfs(row+1,col,image,color,visited,org);
        dfs(row-1,col,image,color,visited,org);
        dfs(row,col+1,image,color,visited,org);
        dfs(row,col-1,image,color,visited,org);
    }
}