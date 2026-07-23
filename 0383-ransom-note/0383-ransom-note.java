class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

    HashMap<Character ,Integer> ransom = new HashMap<>();
    HashMap<Character ,Integer> maga = new HashMap<>();
    for (int i=0;i<ransomNote.length();i++){
        ransom.put(ransomNote.charAt(i), ransom.getOrDefault(ransomNote.charAt(i),0)+1);
    }
    for(int i=0;i<magazine.length();i++){
        maga.put(magazine.charAt(i), maga.getOrDefault(magazine.charAt(i),0)+1);
    }
    for(Map.Entry<Character,Integer> m : ransom.entrySet()){
        if(!maga.containsKey(m.getKey()) || m.getValue()>maga.get(m.getKey())) return false;
    }
 return true;    
}
}