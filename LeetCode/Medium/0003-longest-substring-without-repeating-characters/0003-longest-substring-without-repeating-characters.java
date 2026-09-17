class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        HashSet<Character> set = new HashSet<>();
        int st=0;
        int end=0;
        while(end<s.length()){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(st));
                st++;
            }
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
            }
            
            maxlen=Math.max(maxlen,end-st+1);
            end++;
        }
        return maxlen;
    }
}