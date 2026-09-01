class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<int[]>> adjmap= new HashMap<>();
        for(int i=1;i<n+1;i++){
            adjmap.put(i,new ArrayList<>());
        }
        for(int[] edge:times){
            adjmap.get(edge[0]).add(new int[]{edge[1],edge[2]});
          //  adjmap.get(edge[1]).add(new int[]{edge[0],edge[2]});

        }

        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->(a[1]-b[1]));
        pq.offer(new int[]{k,0});
        int [] dist = new int[n];
    
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k-1]=0;
        while(!pq.isEmpty()){
            int [] cur =pq.poll();
            int dis=cur[1];
            if(dist[cur[0]-1]<dis) continue;
            for(int [] nei :adjmap.get(cur[0])){
                int newdis = dis+nei[1];
                if(newdis<dist[nei[0]-1]){
                    dist[nei[0]-1]=newdis;
                    pq.offer(new int []{nei[0],newdis});
                }

            }
        }
        int maxdis=0;
        for(int i=0;i<n;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;
            maxdis=Math.max(dist[i],maxdis);
        }
        
        return maxdis;
    }
}