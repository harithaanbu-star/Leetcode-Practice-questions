class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefix=0;
        int cnt=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int n:nums){
            prefix+=n;
            if(map.containsKey(prefix-goal))
            cnt+=map.get(prefix-goal);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return cnt;
    }
}