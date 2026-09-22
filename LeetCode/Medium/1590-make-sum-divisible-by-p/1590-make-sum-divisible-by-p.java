class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        //System.out.println(sum);
        int rem =(int) (sum%p);
        if(rem==0) return 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        long pref=0;
        int ans=nums.length;
        for(int j=0;j<nums.length;j++){
            pref+=nums[j];
            int cur =(int)(pref%p);
            int need= (cur-rem+p)%p;
            if(map.containsKey(need)){
                ans= Math.min(ans,j-map.get(need));
            }
            map.put(cur,j);
        }
        return ans==nums.length  ? -1:ans;
    }
}