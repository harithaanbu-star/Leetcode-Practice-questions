class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;
        int cnt=0;
        //HashMap<Integer,Integer> map = new HashMap<>();
        int st=0;
        int end=0;
        if(k<=1) return 0;
        //map.put(1,1);
        while(end<nums.length){
            pro*=nums[end];
            while(pro>=k){
                pro/=nums[st];
                st++;
            }
            cnt+=end-st+1;
            end++;
        }
        return cnt;
    }
}