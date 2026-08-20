class Solution {
    public int characterReplacement(String s, int k) {
        int [] c= new int[26];
        int i=0;
        int cnt=0;
        int maxcnt=0;
        for(int j=0;j<s.length();j++){
            c[s.charAt(j)-'A']++;
            cnt=Math.max(cnt,c[s.charAt(j)-'A']);
            while((j-i+1)-cnt>k){
                c[s.charAt(i)-'A']--;
                i++;
            }
            maxcnt=Math.max(maxcnt,(j-i+1));
        }   
        return maxcnt;
    }
}