class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n=s.length();
        int i=1;
        st.push(s.charAt(0));
        while(i<n){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
                
            }else{
            st.push(s.charAt(i));
            
            }
            i++;
        }
        StringBuilder ans =new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return String.valueOf(ans.reverse());
    }
}