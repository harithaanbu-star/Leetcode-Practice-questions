class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dupl=-1;
        int miss=-1;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                dupl=nums[i];
            }
            set.add(nums[i]);
        }
       
        for(int j=0;j<=nums.length;j++){
            if(!set.contains(j))  miss=j;
        }
        return new int[] {dupl,miss};
    }
}