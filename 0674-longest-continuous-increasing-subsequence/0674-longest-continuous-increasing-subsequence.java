class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int seq=1;
        int maxseq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                seq++;
            }else{
                seq=1;
            }
            maxseq=Math.max(seq,maxseq);
        }
        return maxseq;
    }
}