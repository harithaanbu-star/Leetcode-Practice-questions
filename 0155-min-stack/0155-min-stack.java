class MinStack {
        int top=-1;
        int mintop=-1;
        int [] stack= new int[30000];
        int [] minstack= new int[30000];
    public MinStack() {

    }
    
    public void push(int value) {
        stack[++top]=value;
        if(mintop==-1 ||value<=minstack[mintop]){
            minstack[++mintop]=value;
        }
    }
    
    public void pop() {
        if(stack[top--]==minstack[mintop])
            mintop--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return minstack[mintop];
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