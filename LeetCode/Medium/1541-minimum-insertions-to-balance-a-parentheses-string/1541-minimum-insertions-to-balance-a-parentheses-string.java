class Solution {
    public int minInsertions(String s) {
        int cnt=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                cnt++;
            }else if(i+1<s.length() && s.charAt(i+1)==')'){
                if(cnt>0){
                    cnt--;
                }
                else{
                    ans++;
                }
               // cnt++;
               i++;
            } 
            else{
                if(cnt>0){
                    cnt--;
                    ans++;
                }
                else ans+=2;
                //ans++;
            }
        }
        
        return ans+2*cnt;
    }
}