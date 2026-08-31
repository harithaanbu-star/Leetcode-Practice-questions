class Solution {
    public void dfs(int src,HashMap<Integer,List<Integer>>adjmap,ArrayList<Integer> path,List<List<Integer>> ans,int target){
        path.add(src);
        if(src==target){
            ans.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;}
        for(int nei:adjmap.get(src)){
            dfs(nei,adjmap,path,ans,target);
        }
        path.remove(path.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        HashMap<Integer,List<Integer>> adjmap = new HashMap<>();
        for(int i=0;i<graph.length;i++){
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<graph[i].length;j++){
                li.add(graph[i][j]);
            }
            adjmap.put(i,li);
        }
        System.out.println(adjmap);
        ArrayList<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0,adjmap,path,ans,graph.length-1);
        return ans;
    }
}