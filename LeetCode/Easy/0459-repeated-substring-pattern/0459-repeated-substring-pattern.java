class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int len=1;len<n;len++){
            boolean rep=true;
            if(n%len!=0){
                continue;
            }
            else{
                for(int i=len;i<n;i++){
                    if(s.charAt(i)!=s.charAt(i%len)){
                        rep=false;
                        break;
                    }
                }
                if(rep) return true;
            }
        }
        return false;
    }
}