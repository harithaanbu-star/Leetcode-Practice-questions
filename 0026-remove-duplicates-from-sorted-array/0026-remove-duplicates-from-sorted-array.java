class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j=0;
        for(int s:set){
            nums[j]=s;
             j++;
        }
        
        return j;
    }
}