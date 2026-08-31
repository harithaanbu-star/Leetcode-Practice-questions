class Solution {
    public boolean dfs(int src, int dest,HashMap<Integer , ArrayList<Integer>> adjlist,boolean[] visit){
        if(visit[src]) return false;
        if(src==dest) return true;
        visit[src] = true;
        for(int nei:adjlist.get(src)){
            if(dfs(nei,dest,adjlist,visit))
            return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean [] visited = new boolean[n];
        HashMap<Integer, ArrayList<Integer>> adjlist = new HashMap<>();
        for(int i=0;i<n;i++){
            adjlist.put(i,new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int [] edge = edges[i];
            int u=edge[0];
            int v=edge[1];
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
         return dfs(source,destination,adjlist,visited);

        
    }
}