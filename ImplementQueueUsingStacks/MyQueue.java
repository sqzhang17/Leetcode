class MyQueue {
    Stack<Integer> sta = new Stack<Integer>();
    Stack<Integer> aux = new Stack<Integer>();
    
    
    // Push element x to the back of queue.
    public void push(int x) {
        sta.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        while(sta.size()!=1){
            aux.push(sta.pop());
        }
        
        sta.pop();
        
        while(!aux.isEmpty()){
            sta.push(aux.pop());
        }
    }

    // Get the front element.
    public int peek() {
        while(sta.size()!=1){
            aux.push(sta.pop());
        }
        
        int res = sta.peek();
        
        while(!aux.isEmpty()){
            sta.push(aux.pop());
        }
        
        return res;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return sta.isEmpty();
    }
}