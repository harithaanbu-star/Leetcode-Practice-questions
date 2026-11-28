class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        List<Integer> li = new ArrayList<>();
        for(int i=n-k;i<n;i++){
            li.add(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            li.add(nums[i]);
        }
        for(int j=0;j<n;j++){
            nums[j]=li.get(j);
        }
    }
}