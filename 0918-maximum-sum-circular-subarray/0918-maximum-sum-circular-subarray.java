class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int mincur=0;
        int maxcur=0;
        int maxsum=nums[0];
        int minsum=nums[0];
        int tot=0;
        for(int i =0;i<nums.length;i++){
            mincur+=nums[i];
            maxcur+=nums[i];

            maxsum= Math.max(maxsum,maxcur);
            if(maxcur<0) maxcur=0;

            minsum=Math.min(minsum,mincur);
            if(mincur>0) mincur=0;
            tot+=nums[i];
            
        }
        int ans=Math.max(tot-minsum,maxsum);
        if(maxsum<0) return maxsum;
        return ans;
    }
}