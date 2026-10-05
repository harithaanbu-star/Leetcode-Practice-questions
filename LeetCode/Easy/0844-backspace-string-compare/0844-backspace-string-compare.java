class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> ss= new Stack<>();
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='#' ){if(!ss.isEmpty())
                ss.pop();
            }else{
                ss.push(s.charAt(i));
            }
            i++;
        }
        i=0;
        while(i<t.length()){
            if(t.charAt(i)=='#' ){
            if( !st.isEmpty())
            
                st.pop();
            }else{
                st.push(t.charAt(i));
            }
            i++;
        }
        System.out.println(st);
        System.out.println(ss);
        return st.equals(ss);
    }
}