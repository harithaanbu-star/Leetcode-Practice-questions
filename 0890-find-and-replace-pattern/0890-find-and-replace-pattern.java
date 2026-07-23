class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        
        for(int i =0 ;i<words.length;i++){
            boolean flag=true;
            HashMap<Character,Character> wordmap= new HashMap<>();
            HashMap<Character,Character> patmap= new HashMap<>();
            String w= words[i];
            for(int j=0;j<w.length();j++){
                if(!wordmap.containsKey(w.charAt(j))) {
                wordmap.put(w.charAt(j),pattern.charAt(j));
                }
                else{
                     if((wordmap.get(w.charAt(j))  !=pattern.charAt(j))  || w.charAt(j) !=  patmap.get(pattern.charAt(j))){
                   flag=false;}
                }
                if( !patmap.containsKey(pattern.charAt(j))){
                    
                    patmap.put(pattern.charAt(j),w.charAt(j));
                }
                else{
                   if((wordmap.get(w.charAt(j))  !=pattern.charAt(j))  || w.charAt(j) !=  patmap.get(pattern.charAt(j))){
                   flag=false;
                    break;}
                   
                }
                
            }if(flag)
            list.add(w);
            
        }return list;
}}