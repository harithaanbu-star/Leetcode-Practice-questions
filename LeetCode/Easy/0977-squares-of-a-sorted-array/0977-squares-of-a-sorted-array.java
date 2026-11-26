class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]*nums[i]);
        }
        Collections.sort(li);
        int[] ans = new int[nums.length];
        for(int j=0;j<nums.length;j++){
            ans[j]=li.get(j);
        }
        return ans;
    }
}