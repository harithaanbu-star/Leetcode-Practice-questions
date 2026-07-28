class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minSum=nums[0];
        int maxSum=nums[0];
        int minCurrent =0;
        int maxCurrent=0;
        int ans=0;
        int total=0;

        for(int i=0; i<nums.length;i++){
            minCurrent+=nums[i];
            minSum=Math.min(minSum,minCurrent);
            if(minCurrent>0)  minCurrent=0;

            maxCurrent +=nums[i];
            maxSum=Math.max(maxSum,maxCurrent);
            if(maxCurrent<0) maxCurrent=0;
            total+=nums[i];
        }
        ans=Math.max(total-minSum,maxSum);
        if(maxSum<0) return maxSum;
        return ans;
    }
}