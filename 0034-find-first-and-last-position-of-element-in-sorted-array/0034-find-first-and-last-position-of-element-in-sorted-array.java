class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end= nums.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                start=mid;
                end=mid;
                while(start>0 && nums[start-1]==target){
                    start--;
                }
                while(end<nums.length-1 && nums[end+1]==target){
                    end++;
                }
                return new int[]{start,end};
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        
    }return  new int[]{-1,-1};
    }
}