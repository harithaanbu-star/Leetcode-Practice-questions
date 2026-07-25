class Solution {
    public boolean validPalindrome(String s) {
        int left =0;
        int right =s.length()-1;
        int cnt =0;
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                if(cnt>=1){return false;}
                else{
                    cnt++;
                    int l= left;int r=right;
                    left++;
                    while(left<right && s.charAt(left)==s.charAt(right) ){
                        left++;
                        right--;
                    }
                    if(left>=right)return true;
                    left=l;
                    right =r-1;
                    while(left<right && s.charAt(left)==s.charAt(right) ){
                        left++;
                        right--;
                    }
                    return left>=right;
                }
            }else{
                left ++;
                right--;
            }
        }
        return true;
    }
}