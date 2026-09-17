class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st =0;
        int sum=0;
        int mincnt=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                sum-=nums[st];
                mincnt=Math.min(mincnt,i-st+1);
                st++;
            }

        }
        return mincnt==Integer.MAX_VALUE ? 0 : mincnt;
    }
}