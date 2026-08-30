class Solution {
    public int minimumDeletions(int[] nums) {
        int maxele=nums[0];
        int minele=nums[0];
        int minind=0;
        int maxind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[maxind]<nums[i]){
                maxele=nums[i];
                maxind=i;
            }
            if(nums[minind]>nums[i]){
                minele=nums[i];
                minind=i;
            }
        }
        int left=Math.min(minind,maxind);
        int right =Math.max(minind,maxind);
        int delright=nums.length-left;
        int delleft=right+1;
        int delboth= left+1+(nums.length-right);

        return Math.min(delboth,Math.min(delleft,delright));
    }
}