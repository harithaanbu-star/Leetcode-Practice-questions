class Solution {
    public int jump(int[] nums) {
        int coverage =0;
        int lastIndex=0;
        int destination = nums.length-1;
        int steps=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            coverage = Math.max(coverage,i+nums[i]);
            if(i==lastIndex){
                lastIndex=coverage;
                steps++;
            
            if(coverage>=destination) return steps;
        }}
        return steps;
    }
}