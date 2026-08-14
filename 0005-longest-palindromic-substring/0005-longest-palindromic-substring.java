class Solution {
    public String longestPalindrome(String s) {
        String p="";
        if(s.length()<2) return s;
        for(int i=1;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){    
            left--;
            right++;
            if(left<0 && right>=s.length()) break;   
            }
            String pl =s.substring(left+1,right);
            if(pl.length()>p.length()){
            p=pl;}
          left=i-1; 
          right=i;
          while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                 
                left--;
                right++;
               if(left<0 && right>=s.length()) break;
            }
            pl =s.substring(left+1,right);
            if(pl.length()>p.length()){
                p=pl;
            }

        }
        
        return p;
    }
}