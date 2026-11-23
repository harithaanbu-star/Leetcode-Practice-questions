class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        String arr[] = new String[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=String.valueOf(st.pop());
        }
        String ss = "";
        for(int i=0;i<arr.length;i++){
            ss+=arr[i];
        }
        return ss;
    }
}