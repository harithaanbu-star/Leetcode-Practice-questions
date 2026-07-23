class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                   
                }else{
                    break;
                }

            } maxLen=Math.max(maxLen,set.size());
        }
        return maxLen;
    }
}