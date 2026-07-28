class Solution {
    public int maxProduct(int[] nums) {
        int minPro=1;
        int maxPro=1;
        int current=1;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp= maxPro;
                maxPro=minPro;
                minPro=temp; 
            }
            minPro=Math.min(nums[i],minPro*nums[i]);
            maxPro = Math.max(nums[i],maxPro*nums[i]);
        ans=Math.max(ans,maxPro);     

        }
        
        
        return ans;
    }
}