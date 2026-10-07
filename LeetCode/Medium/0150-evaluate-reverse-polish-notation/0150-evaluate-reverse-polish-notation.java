class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String tok: tokens){
            if(!st.isEmpty()){
                if((tok.equals("+") )){
                    int ans=st.pop();
                    if(!st.isEmpty())
                    ans+=st.pop();
                    st.push(ans);
                }else if((tok.equals("-") )){
                    int ans=st.pop();
                    if(!st.isEmpty())
                    ans=st.pop()-ans;
                    st.push(ans);
                }else if((tok.equals("*") )){
                    int ans=st.pop();
                    if(!st.isEmpty())
                    ans*=st.pop();
                    st.push(ans);
                }else if((tok.equals("/") )){
                    int ans=st.pop();
                    System.out.println(ans);
                    if(!st.isEmpty())
                    ans=st.pop()/ans;
                    st.push(ans);
                
                }else{
                st.push(Integer.valueOf(tok));
                System.out.println(st.peek());
                }
            }else{
                st.push(Integer.valueOf(tok));
                System.out.println(st.peek());
            }
        }
        return st.peek();
    }
}