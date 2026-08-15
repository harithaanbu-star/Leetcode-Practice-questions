class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> freqmap= new HashMap<>();
        for(String str:strs){
        String sss=getfreq(str);
        if(freqmap.containsKey(sss)){
            freqmap.get(sss).add(str);
        }else{
            ArrayList<String> li = new ArrayList<>();
            li.add(str);
            freqmap.put(sss,li);
        }

        }

        return new ArrayList<>(freqmap.values()); 
    }
    private String getfreq(String st){
        int freq[] = new int[26];
        for(char c:st.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char cc='a';
        for(int i:freq){
            sb.append(cc);
            sb.append(i);
            cc++;
        }
        return sb.toString();
    }
}