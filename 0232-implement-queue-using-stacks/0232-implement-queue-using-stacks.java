import java.util.*;

class MyQueue {
    Stack<Integer> st;
    Stack<Integer> hst;
    public MyQueue() {
        st = new Stack<>();  
        hst=new Stack<>(); 
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            hst.push(st.pop());
        }
        st.push(x);
        while(!hst.isEmpty()){
            st.push(hst.pop());
        }
    }

    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}