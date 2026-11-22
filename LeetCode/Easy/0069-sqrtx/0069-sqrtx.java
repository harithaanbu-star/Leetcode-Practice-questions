class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x<4)return 1;
        
        int left=0;
        int right=x/2;
        int ans =0;
        while(left<=right){
        
        int mid=left+(right-left)/2;
        //int ans =0;
        if(mid  <=x/mid){
            left=mid+1;
            ans=mid;
        }else{
            right=mid-1;
        }}
        return ans;
    }
    
}