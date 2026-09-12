class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int [] freq = new int[26];
            for(char c: str.toCharArray()){
                freq[c-'a']++;
            }
            String s ="";
            for(int i=0;i<26;i++){
                while(freq[i]>0){
                    s+=(char) ('a'+i);
                    freq[i]--;
                }
            }
            if(map.containsKey(s)){
                map.get(s).add(str);
            }else{
                map.put(s,new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(map.values());
    }
}