class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length-1;
        int m=matrix[0].length-1;
        int ns=0;
        int ms=0;
        List<Integer> list = new ArrayList<>();
        while(ns<=n && ms<=m){
        for(int i=ms;i<=m;i++){
            list.add(matrix[ns][i]);
        }
        ns++;
        for(int j=ns;j<=n;j++){
            list.add(matrix[j][m]);
        }
        m--;
        if(ns<=n){
        for(int k=m;k>=ms;k--){
            list.add(matrix[n][k]);
        }
         n--;
        }
       
        if(ms<=m){
        for(int l=n;l>=ns;l--){
            list.add(matrix[l][ms]);
        }
        ms++;}
          
}
        return list;
    }
}