class Solution {
    public int minAnagramLength(String s) {
        int n= s.length();
        for(int l=1;l<n;l++){
            if(n%l !=0) continue;
            int freq [] = new int[26];
            for(int j=0;j<l;j++){
            freq[s.charAt(j)-'a']++;}
            boolean vaild=true;
            for(int i=l;i<n;i=i+l){
                int [] cur = new int[26];
                for(int k=i;k<l+i;k++){
                cur[s.charAt(k)-'a']++;}
                if(!Arrays.equals(cur,freq)){
                vaild=false;
                break;
            }
            }
            if(vaild){
            return l;}
        }
        return n;
    }
}