class Solution {
    public int subarraySum(int[] nums, int k) {
        int pre=0;
        int tot=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                tot+=map.get(pre-k);
            
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return tot;
    }
}