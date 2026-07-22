class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int [] ans= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        k=k%n;
        if(k!=0){
            for(int i=0;i<n;i++){
                int j= i+k;
                if(j<n){
                    nums[j]=ans[i];
                }else{
                    j=k+i-n;
                    nums[j]=ans[i];
                }
            }
        }
    }
}