class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]=new int[nums.length];
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd =new ArrayList<>();
        int j=0;int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        for(int e=0;e<nums.length;e=e+2){
            ans[e]=even.get(j);
            j++;
        }
        for(int o=1;o<nums.length;o=o+2){
            ans[o]=odd.get(k);
            k++;
        }
        return ans;
    }
}