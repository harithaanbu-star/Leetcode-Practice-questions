class Solution {
        static  boolean isAlphanum(char c){
            if((c<='Z' && c>= 'A') || (c<='z' && c>='a') || (c<='9' && c>='0')){
                return true;
            }else return false;
        }
    public boolean isPalindrome(String s) {

        String s1=s.toLowerCase();
        int left =0;
        int right=s.length()-1;
        while(left<right){
            if(isAlphanum(s1.charAt(left)) && isAlphanum(s1.charAt(right))){
                if(s1.charAt(left) != s1.charAt(right)){
                    return false;
                }
                
            left++;
            right--;
            }else{
               if( ! isAlphanum(s1.charAt(left))) {
                left++;
                continue;
               }
                if(! isAlphanum(s1.charAt(right))){
                right --;
                continue;
               }

            }
        }
        return true;
    }
}