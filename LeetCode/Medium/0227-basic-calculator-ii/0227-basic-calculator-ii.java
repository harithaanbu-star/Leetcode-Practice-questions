class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        char op='+';
        int num=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(Character.isDigit(s.charAt(i))){
                    num=num*10 +(c-'0');
            }
            if((!Character.isDigit(c) && c!=' ') || i==s.length()-1){
                if(op=='+'){
                    st.push(num);
                }else if(op=='-'){
                    st.push(-num);
                }else if(op=='*'){
                    st.push(st.pop()*num);
                }else if(op=='/'){
                    st.push(st.pop()/num);
                }
                num=0;
                op=c;
            }
            if(!st.isEmpty()){
                System.out.println(st.peek());
            }
            
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}