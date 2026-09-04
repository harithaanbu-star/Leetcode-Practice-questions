class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int maxval =0;
       
        for(int i=0;i<n;i++){
            int minval =Integer.MAX_VALUE;
            maxval=Math.max(nums[i],maxval);
            for(int j=i;j<n;j++){
                minval=Math.min(minval,nums[j]);
            }
            if(maxval-minval<=k)
                return i;
        }
        return -1;
    }
}