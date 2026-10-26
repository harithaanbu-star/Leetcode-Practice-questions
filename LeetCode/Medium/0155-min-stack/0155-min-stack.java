class MinStack {
    Stack<Integer> st ;
    Stack<Integer> minst;
    
    public MinStack() {
        st = new Stack<>();
        minst = new Stack<>();
    }
    
    public void push(int value) {
        if(!minst.isEmpty()){
            if(minst.peek()>=value){
                minst.push(value);
            }
        }
        else{
            minst.push(value);
        }
        st.push(value);
    }
    
    public void pop() {
        int val=st.pop();
        if(!minst.isEmpty() && minst.peek()==val){
            minst.pop();
        }
       // System.out.println(val);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */