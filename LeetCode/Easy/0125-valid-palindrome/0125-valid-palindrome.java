class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int left=0;
        int right =s.length()-1;
        while(left<=right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(((l>='a' && l<='z') && (r>='a' && r<='z'))||((l>='0'&&l<='9')&&(r>='0'&&r<='9'))){
                if(l!=r) return false;
            left++;
            right--;
            }else if((r<'a' || r>'z')&&(r<'0'||r>'9')){ 
                right--;
                }
            else if((l<'a' || l>'z')&&(l<'0' || l>'9')){ 
                left++;
                }
            else return false;

        }
        return true;
    }
    
}