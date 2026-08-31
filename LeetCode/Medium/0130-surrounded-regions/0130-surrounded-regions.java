class Solution {
    public void dfs(char[][] board,int r,int c, boolean[][] visited){
        if(r>=board.length || r<0 || c<0 || c>=board[0].length) return;
        if(visited[r][c]) return ;
        if( board[r][c]=='X') return;
        visited[r][c]=true;
        dfs(board,r+1,c,visited);
        dfs(board,r-1,c,visited);
        dfs(board,r,c+1,visited);
        dfs(board,r,c-1,visited);
    }
    public void solve(char[][] board) {
        boolean [][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                dfs(board,i,0,visited);
            }
            if(board[i][board[0].length-1]=='O'){
                dfs(board,i,board[0].length-1,visited);
            }
        }
        for(int j=0;j<board[0].length;j++){
            if(board[0][j]=='O')
            dfs(board,0,j,visited);
            if(board[board.length-1][j]=='O')
            dfs(board,board.length-1,j,visited);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&& !visited[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
}