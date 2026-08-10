class Solution {
    public void reverseString(char[] s) {
        char [] ans  = new char[s.length];
        int j=0;
        for(int i=s.length-1;i>=0;i--){
            ans[j]=s[i];
            j++;
        }
        for(int k=0;k<s.length;k++){
            s[k]=ans[k];
        }
    }
}