class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(set.containsKey(nums[i])){
                set.put(nums[i],set.get(nums[i])+1);
            }else{
                set.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> map :set.entrySet()){
            if(map.getValue()>n/2){
                return map.getKey();
            }
        }return -1;
    }
}