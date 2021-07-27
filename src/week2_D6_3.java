import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/
// time : 30m

public class week2_D6_3 {

    class MyQueue {

        /** Initialize your data structure here. */
        public MyQueue() {
            
        }
        Stack<Integer> s1 = new Stack(); // main Stack
        Stack<Integer> s2 = new Stack(); // Stack의 순서를 바꿔 FIFO로 작동하도록 함
        
        /** Push element x to the back of queue. */
        public void push(int x) {
            while (!s2.isEmpty())
                s1.push(s2.pop());
          
            s1.push(x);
            
        }
        
        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (!s1.isEmpty())
                s2.push(s1.pop());
          
            return s2.pop();
        }
        
        /** Get the front element. */
        public int peek() {
            while (!s1.isEmpty())
                s2.push(s1.pop());
          
            return s2.peek();
            
        }
        
        /** Returns whether the queue is empty. */
        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }
    
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
    
}
