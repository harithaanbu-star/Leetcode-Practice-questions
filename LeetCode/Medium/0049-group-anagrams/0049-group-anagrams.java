class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] freq= new int[26];
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
            }
            String ss = "";
            for(int i=0;i<26;i++){
                while(freq[i]>0){
                    ss+=(char)('a'+i);
                    freq[i]--;
                }
            }
            if(map.containsKey(ss)){
                map.get(ss).add(s);
            }else{
                map.put(ss, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}