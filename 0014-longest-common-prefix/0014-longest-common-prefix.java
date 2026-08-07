class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1) return "";
        else if(strs.length==1) return strs[0];
        String s = strs[0];
        String ans="";
        int k=0;
        for(int j=0;j<s.length();j++){
            char op = s.charAt(j);
        for( int i=0 ; i<strs.length;i++){
            if( j>=strs[i].length() || op != strs[i].charAt(j))
            return ans;
            }
            
            ans+=op;
        }
        return ans;
    }
}