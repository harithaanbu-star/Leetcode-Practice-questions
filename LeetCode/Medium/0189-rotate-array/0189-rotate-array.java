class Solution {
    public void rotate(int[] nums, int k) {
        int[] newnum=Arrays.copyOf(nums,nums.length);
        if(nums.length<=k) k=k%nums.length;
        
        for(int i=0;i<nums.length;i++){
            int x= nums.length-k+i;
            if(x<nums.length)
            nums[i]=newnum[x];
            else{
                x=i-k;
                nums[i]=newnum[x];
            }

        }
    }
}