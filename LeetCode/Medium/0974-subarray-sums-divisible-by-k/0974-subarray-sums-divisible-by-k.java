class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int tot=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
            int rem=tot%k;
            if(rem <0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                cnt+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}