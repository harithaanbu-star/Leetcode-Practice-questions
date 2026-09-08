class Solution {
    public void moveZeroes(int[] nums) {
        int cnt =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) cnt++;
            else list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(i>=list.size()){
                nums[i]=0;
            }else
            nums[i]=list.get(i);
        }
    }
}