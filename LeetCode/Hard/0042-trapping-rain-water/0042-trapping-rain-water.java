class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pre = new int[n];
        pre[0]=height[0];
        int [] suf= new int[n];
        suf[n-1]=height[n-1];
        int water =0;
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],height[i]);
            suf[n-i-1]=Math.max(suf[n-i],height[n-i-1]);
        }
        for(int j=0;j<n;j++){
            water+=Math.min(pre[j],suf[j])-height[j];
        }
        return water;
    }
}