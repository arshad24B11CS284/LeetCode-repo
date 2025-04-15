class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> rt = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
       if(st.size()==0){
        st.push(val);
        rt.push(val);
       }else {
         st.push(val);
         if (rt.peek()<val) rt.push(rt.peek());
         else rt.push(val);
       } 
    }
    
    public void pop() {
        st.pop();
        rt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return rt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */