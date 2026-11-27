class Solution {
    public void reverseString(char[] s) {
        String ss = "";
        for(int i=0;i<s.length;i++){
            ss+=s[i];
        }
        int l=0;
        for(int j=s.length-1;j>=0;j--){
            s[l]=ss.charAt(j);
            l++;
        }
    }
}