class Solution {
    public String removeKdigits(String num, int k) {
        Stack<String> st = new Stack();
        for(int i=0;i<num.length();i++){
            while(k>0 && !st.isEmpty() && st.peek().charAt(0) >num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(String.valueOf(num.charAt(i)));
        }
        while(k>0){
            st.pop();
            k--;
        }
        String ans = "";
        for(String sts :st){
            ans+=sts;
        }
        ans=ans.replaceFirst("^0+","");
        if(ans.length()==0){
            return "0";
        }
        return ans;
    }
}