class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> st = new Stack<>();;
        Stack<Integer>  cnt = new Stack<>();
        for(int i=0;i<s.length();i++){
            
            if(!cnt.isEmpty() && s.charAt(i)==st.peek()){
                cnt.push(cnt.pop()+1);
                st.push(s.charAt(i));
            }else{
                cnt.push(1);
                st.push(s.charAt(i));
            }
           
            if(cnt.peek()==k){
                for(int a=0;a<k;a++){
                    st.pop();
                }
                cnt.pop();
            }
        }
        String [] arr = new String[st.size()];
        for(int l=st.size()-1;l>=0;l--){
            arr[l]=String.valueOf(st.pop());
           // System.out.println(arr[l]);
        }
        String answer ="";
        for(int m=0;m<arr.length;m++){
            answer+=arr[m];
        }
        return answer;
    }
}