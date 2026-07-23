class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character , Character> maps= new HashMap<>();
        HashMap<Character , Character> mapt= new HashMap<>();
        if(s.length()!=t.length()) return false;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(!maps.containsKey(s.charAt(i))) maps.put(s.charAt(i),t.charAt(i));
            else{
                if(maps.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            if(!mapt.containsKey(t.charAt(i))) mapt.put(t.charAt(i),s.charAt(i));
            else{
                if(mapt.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}