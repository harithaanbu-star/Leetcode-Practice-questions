class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=1;i<=s.length();i++){
            int x=s.charAt(i-1)-'a';
            ans+=(26-x)*i;
        }
        return ans;
    }
}