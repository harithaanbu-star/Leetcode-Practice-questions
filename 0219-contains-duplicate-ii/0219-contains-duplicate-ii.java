class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
             int m= map.get(nums[i]);
             map.put(nums[i],i);
             if(m!=i  && Math.abs(m-i)<=k) return true; 
            }
        }
      return false;  
    }
}