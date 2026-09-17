class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character>  set = new HashSet<>(Set.of('a','e','i','o','u'));
        int cnt=0;
        int end=k;
        int maxcnt=0;
        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i)))
            cnt++;
        }
        int st=0;
        maxcnt=Math.max(maxcnt,cnt);
        while(end<s.length()){
            if(set.contains(s.charAt(st))) cnt--;
            if(set.contains(s.charAt(end))) cnt++;
            maxcnt=Math.max(cnt,maxcnt);
            st++;
            end++;
        }
        return maxcnt;
    }

}