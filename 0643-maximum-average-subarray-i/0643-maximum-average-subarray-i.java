class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=k;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg =(double)sum/(double) k;
        while(end<nums.length){
            sum=sum+nums[end]-nums[start];
            start++;
            end++;
            avg=Math.max(avg,(double)sum/(double) k );
        }
        return avg;
    }
}