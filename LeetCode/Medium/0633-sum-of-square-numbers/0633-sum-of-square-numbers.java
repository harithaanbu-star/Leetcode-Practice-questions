class Solution {
    public boolean judgeSquareSum(int c) {
        int sqr=(int)Math.pow(c,0.5);
        int l=0;
        int r=sqr+1;
        while(l<=r ){
            long ans =(long)l*l + (long) r*r;
            if(ans==c) return true;
            if(ans<c){
                l++;
            }
            if(ans>c) r--;
        }
        return false;
    }
}