class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int st=0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            st=i;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)){
                j++;

                if(j==needle.length()){
                    return st;
                }
            }
        }
    return -1;
    }
}