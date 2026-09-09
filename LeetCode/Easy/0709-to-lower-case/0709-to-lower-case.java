class Solution {
    public String toLowerCase(String s) {
        String ans ="";
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
                char a= (char) (32+ s.charAt(i));
                ans+=String.valueOf(a);
            }else{
                ans+=String.valueOf(s.charAt(i));
            }
        }
        return ans;
    }
}