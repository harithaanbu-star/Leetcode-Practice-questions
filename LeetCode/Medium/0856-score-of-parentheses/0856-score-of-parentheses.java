class Solution {
    public int scoreOfParentheses(String s) {
        int sum=0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }else{
                int val=st.pop();
                if(val==0){
                    val=1;
                }else{
                    val=2* val;
                }
                st.push(val+st.pop());
            } 
            
        }
        return st.pop();
    }
}