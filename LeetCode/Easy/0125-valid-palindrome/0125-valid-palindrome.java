class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            char st=s.charAt(i);
            char en=s.charAt(j);
           // System.out.println(st +" "+en);
            if(((st<='z' && st>='a')||(st>='0' && st<='9'))    &&( (en<='z' && en>='a')||(en>='0' && en<='9') )){
                if(st!=en){
                    return false;
                }else{
            i++;
            j--;}
            }else if(!Character.isLetterOrDigit(st)){
                i++;
            }else if( !Character.isLetterOrDigit(en) ){
                j--;}
            
            
        }
        return true;
    }
}