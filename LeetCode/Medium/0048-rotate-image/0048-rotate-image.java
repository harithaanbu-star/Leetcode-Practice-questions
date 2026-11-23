class Solution {
    public void rotate(int[][] matrix) {
        int[][] mat = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                mat[i][j]=matrix[j][i];            }
        }
        
        for(int i=0;i<matrix.length;i++){
            int z=0;
            for(int j=matrix[0].length-1;j>=0;j--){
                matrix[i][z]=mat[i][j];        
                z++;
            }
        }
    }
}