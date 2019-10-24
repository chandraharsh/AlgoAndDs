package Run;

import queue.QueueImplWithStack;

public class Queue_demo {
    public static void main(String[] args) {
        QueueImplWithStack queue = new QueueImplWithStack(10);
        queue.addToRear(1);
        queue.addToRear(2);
        queue.addToRear(4);
        System.out.println(queue);
        queue.removeFromFront();
        queue .removeFromFront();
        queue.removeFromFront();
    }
}
