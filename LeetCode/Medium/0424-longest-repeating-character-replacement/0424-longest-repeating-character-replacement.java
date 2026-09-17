class Solution {
    public int characterReplacement(String s, int k) {
        int st =0;
        int end=s.length();
        int maxwin=0;
        int maxfreq=0;
        int[] freq=new int[26];
        for(int i=0;i<end;i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq, freq[s.charAt(i)-'A']);
            int wid =i-st+1;
            if(wid-maxfreq>k){
                freq[s.charAt(st)-'A']--;
                st++;
            }
            maxwin=Math.max(maxwin,i-st+1);
        }
        return maxwin;
    }
}