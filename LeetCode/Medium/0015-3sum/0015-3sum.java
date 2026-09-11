class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum =nums[i]+nums[j]+nums[k];
                if(sum==0){
                List<Integer> li = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                set.add(li);
                j++;k--;
                }else if (sum>0){
                    k--;
                }else{
                    j++;
                }

        }
        
        }
        for(List<Integer> l: set){
            ans.add(l);
        }
        return ans;
    }
}