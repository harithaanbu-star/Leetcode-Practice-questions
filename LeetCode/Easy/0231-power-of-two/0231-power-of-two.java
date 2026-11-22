class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        int cnt=0;
        int x=n;
        while(n>1){
            n/=2;
            cnt++;
            System.out.println(n);
        }
        if(n==1 && Math.pow(2,cnt)==x) return true;
        return false;
    }
}