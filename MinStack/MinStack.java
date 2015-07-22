class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> aux = new Stack<Integer>();
    
    public void push(int x) {
        stack.push(x);
        
        if(aux.isEmpty() || x<=aux.peek()){
            aux.push(x);
        }
    }

    public void pop() {
        if(this.stack.isEmpty()) return;
        
        if(stack.peek().equals(aux.peek())){
            aux.pop();
        }
        
        stack.pop();
    }

    public int top() {
       return this.stack.peek();
    }

    public int getMin() {
        return this.aux.peek();
    }
}