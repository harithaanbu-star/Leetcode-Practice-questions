class Solution {
    public int trap(int[] height) {
        int n= height.length-1;
        int leftmax=height[0];
        int rightmax=height[n];
        int left=0;
        int right=n;
        int tot=0;
        for(int i=0;i<n;i++){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }else{
                    tot+=leftmax-height[left];
                    
                }left++;
            }else if(height[right]<height[left]){
                if(height[right]>rightmax){
                    rightmax=height[right];
                }else{
                    tot+=rightmax-height[right];
                    
                }
                right--;
            }
        }
        return tot;
    }
}