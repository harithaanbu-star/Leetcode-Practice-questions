class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int y=x;
        if(x<0) return false;
        while(x!=0){
            int last =x%10;
            rev=rev*10+last;
            x/=10;
        }
        return rev==y;
    }
}