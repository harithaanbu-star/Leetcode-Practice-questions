class Solution {
    public static void dfs(int node,boolean[] visited , HashMap<Integer,ArrayList<Integer>> map ){
        visited[node]=true;
        if(!map.get(node).isEmpty()){
        for(int nei:map.get(node)){
            if( !visited[nei]){
                visited[nei]=true;
                dfs(nei,visited,map);
            }
        }
    }}
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] visited= new boolean[rooms.size()];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<rooms.size();i++){
            map.put(i,new ArrayList<>(rooms.get(i)));
        }
        dfs(0,visited,map);
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
}