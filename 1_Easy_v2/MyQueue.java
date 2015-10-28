class MyQueue {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> aux = new Stack<Integer>();
        
    // Push element x to the back of queue.
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(!stack.empty()){
            aux.push(stack.pop());
        }
        aux.pop();
        
        while(!aux.empty()){
            stack.push(aux.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while(!stack.empty()){
            aux.push(stack.pop());
        }
        
        Integer temp = aux.peek();
        
        while(!aux.empty()){
            stack.push(aux.pop());
        }
        
        return temp;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.empty();
    }
}