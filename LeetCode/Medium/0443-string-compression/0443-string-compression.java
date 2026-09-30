class Solution {
    public int compress(char[] chars) {
        int c=1;
        
        String ans="";
        int j=0;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                c++;
            }
            else{
                if(c>1){
                    ans+=chars[i-1]+""+c;
                }else{
                    ans+=chars[i-1];
                    chars[j]=chars[i-1];
                    j++;
                }
                c=1;
                
            }
        }
        if(chars.length>=2 && chars[chars.length-1]!=chars[chars.length-2]);
        ans+=chars[chars.length-1];
       // chars[j]=chars[chars.length-1];
       if(c>1)
        ans+=c;
        System.out.println(ans);

        for(int l=0;l<ans.length();l++){
            chars[l]=ans.charAt(l);
        }
        return ans.length();
    }
}