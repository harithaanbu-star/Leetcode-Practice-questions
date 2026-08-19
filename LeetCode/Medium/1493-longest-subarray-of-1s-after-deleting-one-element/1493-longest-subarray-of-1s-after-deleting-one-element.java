class Solution {
    public int longestSubarray(int[] nums) {
        int zc=0;
        int maxlen = Integer.MIN_VALUE;
        int start=0;
        for(int end=0;end<nums.length ; end++){
            if(nums[end]==0){
                zc+=1;
            }
                while(zc>1){
                    
                    if(nums[start]==0){
                        zc-=1;
                    }
                    start++;
                } 
            
            maxlen=Math.max(maxlen,end-start);
    }
        return maxlen;
    }
}