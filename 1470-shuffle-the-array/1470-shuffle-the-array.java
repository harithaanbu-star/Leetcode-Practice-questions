class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x= new int[n];
        int [] y = new int[n];
        for(int i=0;i<nums.length;i++){
            if(i<n){
                x[i]=nums[i];
            }else{
                y[i-n]=nums[i];
            }
        }
        int k=0;
        int l=0;
        for(int j=0;j<nums.length;j++){
            if(j%2==0){
                nums[j]=x[k];
                k++;
            }else{nums[j]=y[l];
            l++;}
        }
        return nums;
    }
}