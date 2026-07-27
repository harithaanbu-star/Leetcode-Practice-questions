class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen =Integer.MAX_VALUE;
        int start=0;
        int end=0;
        int window=nums[0];
        if(window>=target) return 1;
        while(end<nums.length-1){
            end++;
            window+=nums[end];
            while(target<=window){
                minLen=Math.min(minLen,end-start+1);
                window-=nums[start];
                start++;
            }
        }
        return minLen==Integer.MAX_VALUE ? 0: minLen;
    }
}