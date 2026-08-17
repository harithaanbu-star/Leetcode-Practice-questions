class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        reverse(left,right,s);
    }
    static void reverse(int left,int right,char[]s){
        if(left>=right) return ;
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        reverse(left+1,right-1,s);
    }
}