class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=-1;
        int e=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                if(m>0 && nums[m-1]==target){
                    r=m-1;
                }else {
                    s=m;
                    break;
                }
            }else if(nums[m]>target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        
        l=0;
        r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]==target){
                if(m<nums.length-1 && nums[m+1]==target){
                    l=m+1;
                }else{
                    e=m;
                    break;
                }
            }else if(nums[m]>target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        
            return new int[] {s,e};
    }
}