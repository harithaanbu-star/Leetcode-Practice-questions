class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> set = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }

        }   
        for(int i=0;i<nums.length;i++){
            if(i<set.size())
            nums[i]=set.get(i);
        }
        return set.size();
    }
}