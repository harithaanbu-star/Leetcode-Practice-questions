class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix [] = new int[nums.length];
        int suffix [] = new int[nums.length];
        int answer [] = new int[nums.length];
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
            suffix[nums.length-i-1]=suffix[nums.length-i]*nums[nums.length-i];
        }for(int j=0;j<nums.length;j++){
            answer[j]=suffix[j]*prefix[j];
        }
    return answer;
    }
}