class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int w1=word1.length();
        int w2 = word2.length();
        String s="";
        for(int j=0;j<Math.min(w1,w2);j++){
            s+=word1.charAt(i);
            s+=word2.charAt(i);
            i++;
        }
        while(i<w1){
            s+=word1.charAt(i);
            i++;
        }
        while(i<w2){
            s+=word2.charAt(i);
            i++;
        }
        return s;
    }
}