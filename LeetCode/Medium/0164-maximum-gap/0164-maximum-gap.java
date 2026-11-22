class Solution {
    public int maximumGap(int[] nums) {
        int maxn =Integer.MIN_VALUE;
        if(nums.length<2)return 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            maxn=Math.max(maxn,nums[i+1]-nums[i]);
        }
        return maxn;
    }
}