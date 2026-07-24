class Solution {
    public int countCharacters(String[] words, String chars) {
        int [] ch= new int [26];
        
        for(int i=0;i<chars.length();i++){
            ch[chars.charAt(i)-'a']++;
        }
        int count=0;
        for(String word:words){
            boolean flag=true;
            int [] temp =ch.clone();
            for(int j=0;j<word.length();j++){
                if(temp[word.charAt(j)-'a'] <=0){                    
                    flag=false;
                }else{
                temp[word.charAt(j)-'a']--;
}
                
            }
            if(flag) count+= word.length();
        }
        return count;
    }
}