class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=Math.max(maxsum,(double)sum/k);
        int st =0;
        int end =k;
        while(end<nums.length){
            sum-=nums[st];
            sum+=nums[end];
            maxsum=Math.max(maxsum,(double)sum/k);
            st++;
            end++;
        }
        if( maxsum==Integer.MIN_VALUE) return nums[0];
        return maxsum;
    }
}