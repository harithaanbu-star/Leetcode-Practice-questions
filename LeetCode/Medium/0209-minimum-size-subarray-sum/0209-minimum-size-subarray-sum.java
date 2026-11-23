class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st=0;
        int end=1;
        int win=nums[st];
        int size =Integer.MAX_VALUE;
        if(nums.length<2){
            if(nums[0]>=target){
                return 1;
            }
        }
        while(end<nums.length){
            System.out.println(end +" "+st);
            if(win<target){
            win+=nums[end];
            end++;}
            while(win>=target){
                System.out.println(size);
                size =Math.min(size,end-st);
                win-=nums[st];
                st++;
            }
            
        }if(size==Integer.MAX_VALUE) return 0;
        return size;
    }
}