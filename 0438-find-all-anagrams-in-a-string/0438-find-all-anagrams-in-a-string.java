class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        List<Integer> list = new ArrayList<>();

        for(int j=0;j<=s.length()-n;j++){
            int[] char1 = new int[26];
        for(int i=0;i<n;i++){
            char1[p.charAt(i)-'a']+=1;
        }
            String ss=s.substring(j,j+n);
            for(int l=j;l<j+n;l++){
            char1[ss.charAt(l-j)-'a']-=1;
        }
        boolean anagram=true;
        for(int k=0;k<char1.length;k++){
            if(char1[k]!=0) {
                anagram=false;
                break;
            }
        }if(anagram)
        list.add(j); 
        }
        return list;
    }
}