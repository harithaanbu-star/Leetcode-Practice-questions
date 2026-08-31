class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int min=0;
        int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh>0){
            int s=q.size();
            for(int i=0;i<s;i++){
            int[] cur = q.poll();
            for(int[] d:dir){
                int nr=cur[0]+d[0];
                int nc=cur[1]+d[1];

                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                    fresh--;
                    grid[nr][nc]=2;
                    q.offer(new int[]{nr,nc});
                }
            }
            
            }
            min++;
        }
if(fresh>0) return -1;
    return min;
    }
}