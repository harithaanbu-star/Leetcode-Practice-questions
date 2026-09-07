class Solution {
    public int distinctSubseqII(String s) {
        long [] dp= new long[s.length()+1];
        long [] cha = new long[26];
        dp[0]=1;
        for(int i=1;i<=s.length();i++){
            int ch=s.charAt(i-1)-'a';
            dp[i]=(2*dp[i-1]-cha[ch]+mod)%mod;
            cha[ch]=dp[i-1];
        }
        return (int)((dp[s.length()]-1+mod)%mod);
    }
    static final long mod=1000000007;
}