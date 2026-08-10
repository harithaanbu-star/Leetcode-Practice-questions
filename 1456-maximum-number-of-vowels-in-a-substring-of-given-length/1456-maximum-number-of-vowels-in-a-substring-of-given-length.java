class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vow = new HashSet<>(Set.of('a','e','i','o','u'));
        
        int cnt=0;
        for(int i=0;i<k;i++){
            if(vow.contains(s.charAt(i))) cnt++;
        }
        int maxval=cnt;
        for(int j=k;j<s.length();j++){
            if(vow.contains(s.charAt(j-k)))cnt--;
            if(vow.contains(s.charAt(j))) cnt++;
            maxval=Math.max(maxval,cnt);
        }
        return maxval;
    }
}