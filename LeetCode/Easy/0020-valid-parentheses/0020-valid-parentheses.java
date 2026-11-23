class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>() ;
       // st.push(s.charAt(0));
        for(int i=0;i<s.length();i++){
           // if(!st.isEmpty())
           if(s.charAt(i)== '['||s.charAt(i)== '('||s.charAt(i)== '{'){
                st.push(s.charAt(i));
           }else {
            if(!st.isEmpty()){
                if((st.peek()=='('&&s.charAt(i)==')'  ) || (st.peek()=='['&&s.charAt(i)==']' ) || (st.peek()=='{'&&s.charAt(i)=='}' )){
                    st.pop();
                }else{
                    return false;
                }
            
        }else if(st.isEmpty()){
            return false;
        }
        }
        
        }
        return st.isEmpty();  
    }
}