class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        int l=0;
        for(int i=0;i<nums.length;i++){
            int r=tot-l-nums[i];
            if(l==r) return i;
            l+=nums[i];
        }
        return -1;
    }
}