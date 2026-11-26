class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result =nums[0]+nums[1]+nums[2] ;
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==target){
                return sum;
            }
            if(sum>target) k--;
            if(sum<target) j++;
            int newdiff = Math.abs(sum-target);
            if(newdiff<diff){
                diff=newdiff;
                result=sum;
            }}

        }
        return result;
    }
}