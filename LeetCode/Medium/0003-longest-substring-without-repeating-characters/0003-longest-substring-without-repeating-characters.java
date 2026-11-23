class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st =0;
        int en=0;
        int maxlen=0;
        HashSet<Character> set = new HashSet<>();
        while(en<s.length()){
            while(set.contains(s.charAt(en))){
                set.remove(s.charAt(st));
                st++;
            }
            if(!set.contains(s.charAt(en))){
                set.add(s.charAt(en));
            }
            
            maxlen=Math.max(maxlen,en-st+1);
            en++;
        }
        
        return maxlen;
    }
}