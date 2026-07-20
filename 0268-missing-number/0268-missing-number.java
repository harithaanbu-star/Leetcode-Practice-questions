class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(i!=nums[i]) return i;
        }
        if(nums[nums.length-1]<nums.length) return nums.length; 
       return -1;
    }
}