class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int nu:nums){
            map.put(nu,Boolean.FALSE);
        }
        int lon=0;
        for(int num:nums){
            int cur=1;
            int nextnum=num+1;
        while(map.containsKey(nextnum)&& map.get(nextnum)==false){
            cur++;
            map.put(nextnum,Boolean.TRUE);
            nextnum++;
        }
        int prevnum=num-1;
        while(map.containsKey(prevnum) &&map.get(prevnum)==false ){
            cur++;
            map.put(prevnum,Boolean.TRUE);
            prevnum--;
        }
        lon=Math.max(lon,cur);
        }
        return lon;
    }
}