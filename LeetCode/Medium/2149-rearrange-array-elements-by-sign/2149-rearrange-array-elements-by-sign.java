class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] pos = new int[nums.length/2];
        int [] neg = new int[nums.length/2];
        int [] newarr = new int[nums.length];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos[j]=nums[i];
                j++;
            }else{
                neg[k]=nums[i];
                k++;
            }
        }
        int m=0;
        for(int l=0;l<nums.length;l=l+2){
            newarr[l]=pos[m];
            newarr[l+1]=neg[m];
            m++;
        }
        return newarr;
    }
}