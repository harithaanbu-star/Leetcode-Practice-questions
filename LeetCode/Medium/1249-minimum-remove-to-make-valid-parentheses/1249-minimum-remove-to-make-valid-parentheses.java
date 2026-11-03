class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int ind=-1;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.isEmpty()){
                    continue;
                }else if(!st.isEmpty()){
                    st.pop();
                }
            }else if (s.charAt(i)=='('){
                if(s.charAt(i)=='('){
                    st.push('(');
                }
            }
            sb.append(s.charAt(i));
            
            
        }
        for(int j=0;j<st.size();j++){
                //String ss = sb.toString();
                int indx=sb.lastIndexOf("(");
                if(indx<0)continue;
                else
                sb.deleteCharAt(indx);
                
            }
        return sb.toString();
    }
}