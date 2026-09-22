class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
            if(map.containsKey(tot)){
                max=Math.max(max, i-map.get(tot));
            }
           else  map.put(tot,i);
        }
        return max;
    }
}