class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st= new Stack();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.push(i);
            else if(s.charAt(i)==')'){
                if(! st.isEmpty() ) st.pop();
                else{
                    sb.setCharAt(i,'*');
                }
            }
        }
        while(!st.isEmpty()){
            int index=st.pop();
            sb.setCharAt(index,'*');
        }

        StringBuilder newsb = new StringBuilder();
        for(int j=0;j<sb.length();j++){
            if(sb.charAt(j)!='*')
            newsb.append(sb.charAt(j));
        }
        return newsb.toString();
    }
}