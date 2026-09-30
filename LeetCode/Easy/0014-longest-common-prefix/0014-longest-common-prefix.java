class Solution {
    public String longestCommonPrefix(String[] strs) {
        String small =strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<small.length()){
                small = strs[i];
            }
        }
        int len=small.length();
        
        for(int k=len;k>=0;k--){
            boolean found=true;
        for(int i=0;i<strs.length;i++){
            
            if(!(strs[i].substring(0,k)).equals(small.substring(0,k))){
                found=false;
                len--;
                break;
            }
            
        }
            if(found){
                return strs[0].substring(0,k);
            }
        
        }
        return "";
    }
}