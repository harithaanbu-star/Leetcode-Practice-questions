class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double maxAvg=0;
        int start=0;
        int end = k-1;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        } avg=sum/k;
        maxAvg =avg;
        while(end<nums.length-1){
            sum +=nums[++end]-nums[start++];
            avg=sum/k;
            maxAvg = Math.max(avg,maxAvg);
        }
        return maxAvg;
    }
}