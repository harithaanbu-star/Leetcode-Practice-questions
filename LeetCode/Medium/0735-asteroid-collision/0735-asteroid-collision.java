class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack();
        for(int i=0;i<asteroids.length;i++){
            int as =asteroids[i];
            boolean destroy=false;
            while(!st.isEmpty() && as<0 && st.peek()>0){
                if(Math.abs(as)>st.peek()){
                    st.pop();
                    
                }else if(Math.abs(as)<st.peek()){
                    destroy=true;
                    break;
                }else{
                    st.pop();
                    destroy=true;
                    break;
                }
            }
                if(!destroy){
                    st.push(as);
                
            }
            
        }
        int[] ans= new int[st.size()];
        for(int j=0;j<st.size();j++){
            ans[j]=st.get(j);
        }   
        return ans;
    }
}