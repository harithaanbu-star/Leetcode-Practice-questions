class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans = new int[k];
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a,b)->(map.get(b)-map.get(a)));
        for(int i=0;i<k;i++){
            ans[i]=keys.get(i);
        }
        return ans;
    }
}