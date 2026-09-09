class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] arr = new int[r][c];
        if(n*m != r*c) return mat;
        for(int i=0;i<n*m;i++){
            int or=i/m;
            int oc=i%m;
            int nr=i/c;
            int nc=i%c;
            arr[nr][nc]=mat[or][oc];
        }
        return arr;
    }
}