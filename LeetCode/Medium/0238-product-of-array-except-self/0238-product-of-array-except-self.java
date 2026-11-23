class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans  = new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
            suffix[n-i-1]=suffix[n-i]*nums[n-i];
            System.out.println(prefix[i]+ "  "+suffix[i]);
        }
        for(int j=0;j<n;j++){
            ans[j]=prefix[j]*suffix[j];
        }
        return ans;
    }
}