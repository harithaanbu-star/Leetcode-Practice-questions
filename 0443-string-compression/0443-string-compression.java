class Solution {
    public int compress(char[] chars) {
        
        String s="";
        int c=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c+=1;
            }else{
                if(c==1) s+=chars[i-1];
                else{
                    s+=chars[i-1];
                    s+=c;
                }
                c=1;  
        }}
        s+=chars[chars.length-1];
        if(c>1)s+=c;
        
        for(int i=0; i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}