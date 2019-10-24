package queue;

import stack.StackImpl;

public class QueueImplWithStack {

    private int capacity = 0;


    private StackImpl stack1 = null;
    private StackImpl stack2 = null;

    public QueueImplWithStack(int capacity) {
        this.capacity = capacity;
        this.stack1 = new StackImpl(capacity);
        this.stack2 = new StackImpl(capacity);
    }

    public void addToRear(Integer i) {
        if (stack1.top == capacity - 1)
            System.out.println("Queue is full");
        else
            stack1.push(i);
    }

    private void transfer1(StackImpl stack1, StackImpl stack2) {

        for (int i = stack1.top; i > -1; i--) {
            int k = stack1.pop();
            stack2.push(k);
        }
    }

    public Integer removeFromFront() {
        if (stack1.top == -1) {
            System.out.println("underflow");
            return null;
        }

        transfer1(stack1, stack2);
        int l = stack2.pop();
        // System.out.println("element" + l);
        // transfer2();
        transfer1(stack2, stack1);
        return l;
    }

    @Override
    public String toString() {
        return  "f -> " + stack1.toString();
    }


}



