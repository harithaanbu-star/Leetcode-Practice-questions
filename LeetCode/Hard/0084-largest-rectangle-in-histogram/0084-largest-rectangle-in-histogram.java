class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int [] left = new int[heights.length];
        int [] right= new int[heights.length];
        int n= heights.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]= -1;
            }else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int j=n-1;j>=0;j--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[j]){
                st.pop();
            }
            if(st.isEmpty()){
                right[j]= n;
            }else{
                right[j]=st.peek();
            }
            st.push(j);
        }
        int max=0;
        for(int i=0;i<n;i++){
            int wid=right[i]-left[i]-1;
            int area = wid*heights[i];
            max=Math.max(max,area);
        }
        return max;
    }
}