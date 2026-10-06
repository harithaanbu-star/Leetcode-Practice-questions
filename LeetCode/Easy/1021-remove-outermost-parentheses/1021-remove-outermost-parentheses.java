class Solution {
    public String removeOuterParentheses(String s) {
        //int i=0;
        String ans="";
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(cnt>0){
                    ans+=s.charAt(i);
                }
                cnt++;
            }else{
                cnt--;
                if(cnt>0){
                    ans+=s.charAt(i);
                }
            }
           // System.out.println(cnt + " : "+ans);
        }
        return ans;
    }
}