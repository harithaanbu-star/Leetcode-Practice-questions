class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=0;k<nums.length;k++){
            if(nums[k]%2==0){
                res[i]=nums[k];
                i++;
            }else{
                res[j]=nums[k];
                j--;
            }
        }
        return res;
    }
}