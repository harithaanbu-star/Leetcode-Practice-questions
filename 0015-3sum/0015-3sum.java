class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right=nums.length-1;
            
            while(left<right){
                int ans = nums[i]+nums[left]+nums[right];
            if(nums[i]+nums[left]+nums[right]==0){
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                
            }else if(ans<0) left++;
            else right--;
        }}
        return new  ArrayList<>(list);
    }
}