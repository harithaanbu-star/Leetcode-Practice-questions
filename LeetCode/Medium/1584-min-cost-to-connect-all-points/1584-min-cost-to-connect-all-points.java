class Solution {
    public int minCostConnectPoints(int[][] points) {
        HashMap<Integer,List<int[]>> adjmap = new HashMap<>();
        int n= points.length;
        for(int i=0;i<n;i++){
            adjmap.put(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int w=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                adjmap.get(i).add(new int [] {j,w});
                adjmap.get(j).add(new int[] {i,w});
            }
        }
        int src=0;
        int tot=0;
        boolean [] visited = new boolean[n];
        PriorityQueue<int [] > pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
        pq.offer(new int[]{src,0});
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            if(visited[cur[0]])  continue;
            if(!visited[cur[0]]){
            tot+=cur[1];
            visited[cur[0]]=true;}
            for(int[] nei : adjmap.get(cur[0])){
                if(visited[nei[0]]) continue;
                pq.offer(new int[]{nei[0],nei[1]});
            }
        }
        return tot;
    }
}