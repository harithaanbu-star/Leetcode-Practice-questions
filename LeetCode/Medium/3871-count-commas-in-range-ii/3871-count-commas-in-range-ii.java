class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        long ans = Math.min(n,999999)-999;
        if(n<=999999) return ans;
        ans+= (Math.min(n,999999999L)-999999L)*2;
        if(n<=999999999L) return ans;
        ans+=(Math.min(n,999999999999L)-999999999L)*3;
        if(n<=999999999999L) return ans;
        ans+=(Math.min(n,999999999999999L)-999999999999L)*4;
        if(n<=999999999999999L)
        return ans;
        ans+=(Math.min(n,999999999999999999L)-999999999999999L)*5;
        return ans;
    }
}