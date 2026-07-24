class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        return nums;
    }
}