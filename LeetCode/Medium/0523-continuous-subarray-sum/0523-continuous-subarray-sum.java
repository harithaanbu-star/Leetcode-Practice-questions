class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int tot=0;
        //map.put(nums[0]%k ,map.getOrDefault(nums[0]%k,0)+1);
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
            int rem =tot%k;
            //if(rem==0) return true;
            if(map.containsKey(rem) ){
            if((i-map.get(rem))>=2){ return true;}}
            else
            map.put(rem,i);
        }
        return false;
    }
}