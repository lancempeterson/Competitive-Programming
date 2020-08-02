class ListNode {
    int val;
    int min;
    ListNode next;
    ListNode prev;
    public ListNode(int val, int min, ListNode prev){
        this.val = val;
        this.min = min;
        next = null;
        this.prev = prev;
    }
}

class MinStack {
    
    ListNode tail;

    /** initialize your data structure here. */
    public MinStack() {
        tail = null;
    }
    
    public void push(int x) {
        if ( tail == null ){
            tail = new ListNode(x,x,tail);
            tail.prev = tail;
        }
        else {
            tail.next = new ListNode(x, Math.min(tail.min,x),tail);
            tail = tail.next;
        }
    }
    
    public void pop() {
        if ( tail == null ){
            return;
        }
        else if ( tail.prev == null ){
             tail = null;
        }
        else if ( tail.prev == tail ){
            tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    
    public int top() {
        return tail.val;
    }
    
    public int getMin() {
        return tail.min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */