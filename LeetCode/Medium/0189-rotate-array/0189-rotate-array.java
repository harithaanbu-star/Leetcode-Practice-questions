class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        if(n<= 1 ) return ;
        ArrayList<Integer> list = new ArrayList<>();
        k=k%n;
        if(k!=nums.length && k<n){ 
        for(int i=n-k;i<n;i++){
            list.add(nums[i]);
        }
        for(int j=0;j<n-k;j++){
            list.add(nums[j]);
        }
        for(int l=0;l<n;l++){
            nums[l]=list.get(l);
        }}
    }
}