class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int fr=0;
                int se=0;
                if(!st.isEmpty())
                 fr=st.pop();
            
                if(!st.isEmpty())
                se=st.pop();
                st.push(se);
                st.push(fr);
                st.push(se+fr);
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else if(operations[i].equals("C")){
                st.pop();
            }else {
                st.push(Integer.valueOf(operations[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}