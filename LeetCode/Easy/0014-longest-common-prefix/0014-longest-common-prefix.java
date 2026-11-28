class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length<1) return "";
        if(strs.length==1)return strs[0];
        String a= strs[0];
        String ans ="";
        
        
        for(int i=0;i<a.length();i++){
            char sp=a.charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].length()<=i || sp!=strs[j].charAt(i)){
                    return ans;
                }
            }
            ans+=sp;
        }
        return ans;
    }
}