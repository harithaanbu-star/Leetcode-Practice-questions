class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0) even.add(nums[i]);
            else odd.add(nums[i]);
        }
        int [] ans = new int[nums.length];
        int k=0;
        for(int j=0;j<even.size();j++){
            ans[k]=even.get(j);
            k++;
        }
        for(int l=0;l<odd.size();l++){
            ans[k]=odd.get(l);
            k++;
        }
        return ans;
    }
}