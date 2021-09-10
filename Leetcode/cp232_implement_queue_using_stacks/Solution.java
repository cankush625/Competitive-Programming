class MyQueue {
    Stack<Integer> queue = new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while (!queue.empty()) {
            temp.push(queue.pop());
        }
        queue.push(x);
        while (!temp.empty()) {
            queue.push(temp.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return queue.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return queue.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return queue.empty();
    }
}