class Solution {
    public static void dfs(int node , boolean[] visited,HashMap<Integer,ArrayList<Integer>> adjList ){
        visited[node-1]=true;
        for(int nei:adjList.get(node)){
            if(!visited[nei-1]){
                dfs(nei,visited,adjList);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer,ArrayList<Integer>> adjList = new HashMap<>();
        boolean[] visited = new boolean[isConnected.length];
        int cnt=0;
        for(int i=1;i<=isConnected.length;i++){
            adjList.put(i,new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adjList.get(i+1).add(j+1);
                }
            }
        }
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i+1,visited,adjList);
                cnt++;
            }
        }
        return cnt;
    }
}