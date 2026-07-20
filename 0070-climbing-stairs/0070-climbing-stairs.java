class Solution {
    public int climbStairs(int n) {
        int s1=1;
        int s2=2;
        int c=0;
        if(n<=2) return n;
        for(int i=3;i<=n;i++){
            c= s1+s2;

            s1=s2;
            s2=c;
        }
        return c;
    }
}