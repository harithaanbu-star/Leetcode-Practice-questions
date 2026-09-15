class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int win=nums[start];
        int end=1;
        int size=Integer.MAX_VALUE;
        if(win>=target) return 1;
        while(end<nums.length){
            win+=nums[end];
            while(win>=target){
                size=Math.min(size,end-start+1);
                win-=nums[start];
                start++;
            }
            end++;
        }if(size==Integer.MAX_VALUE) return 0;
        return size;
    }
}