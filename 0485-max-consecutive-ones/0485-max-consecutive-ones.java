class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int i=0;
        int newcount =0;
        while(i<nums.length){
            
            if(nums[i]==0) newcount=0;
            else newcount++;
            cnt=Math.max(cnt,newcount);
            i++;
           
        }return cnt;
    }
}