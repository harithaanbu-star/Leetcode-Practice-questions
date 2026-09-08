class Solution {
    public double myPow(double x, int n) {
        if(x==1.000) return 1;
        if(x==-1.00 ){
            if(n%2!=0) return -1;
            else return 1;
        }
        if(n<=-Math.pow(2,31)) return 0;
        double ans=x;
        if(n>0){
        for(int i=1;i<n;i++){
            ans*=x;
        }}
        else{
            n=Math.abs(n);
            for(int i=0;i<=n;i++){
               
                ans/=x;
                //System.out.println(ans);
            }
        }
        return ans;
    }
}