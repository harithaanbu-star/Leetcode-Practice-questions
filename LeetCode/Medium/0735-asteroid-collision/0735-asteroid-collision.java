class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            boolean des =false;
            while(!st.isEmpty() && asteroids[i]<0 && st.peek()>0){
                if(Math.abs(asteroids[i])>st.peek()){
                    st.pop();
                }else if(Math.abs(asteroids[i])<st.peek()){
                    des= true;
                    break;
                }else{
                    st.pop();
                    des=true;
                    break;
                }
            }
            if(!des){
                st.push(asteroids[i]);
            }
        }
        int len=st.size();
        int ans[] = new int[len];
        for(int j=len-1 ;j>=0;j--){
            ans[j]=st.pop();
        }
        return ans;
    }
}