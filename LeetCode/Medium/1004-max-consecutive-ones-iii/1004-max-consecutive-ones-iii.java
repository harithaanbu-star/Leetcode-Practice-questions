class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int st=0;
        int end=0;
        int maxcnt=0;
        map.put(0,0);
        while(end<nums.length){
            
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.get(0)>k){
                map.put(nums[st],map.getOrDefault(nums[st],0)-1);
                st++;
            }
            maxcnt=Math.max(maxcnt,end-st+1);
            end++;
        }
        return  maxcnt;
    }
}