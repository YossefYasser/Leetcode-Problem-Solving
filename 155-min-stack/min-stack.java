class MinStack {
       Stack<Integer> stack = new Stack<>();
    int count =0;
    int min =Integer.MAX_VALUE;
    
    public MinStack() {
        
    }
    
    public void push(int val) {
       
       if(val<=min)
        {   
            stack.push(min);
             min =val;
             stack.push(val);

        }
        else
        stack.push(val);
       
    }
    
    public void pop() 
    {
       
        if(stack.peek() == min)
        {
        stack.pop();
        min = stack.pop();
      
        }
        
        else
        stack.pop();

        
    }
    
    public int top() {
        return 
        stack.peek();
    }
    
    public int getMin() {
       if(!stack.isEmpty())
        return min;
        else 
            return 0;
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