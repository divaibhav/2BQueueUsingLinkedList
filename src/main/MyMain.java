package main;

import implementation.MyQueue;
import implementation.Node;

public class MyMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(20);
        queue.enqueue(45);
        queue.enqueue(5);
        System.out.println(" no of element = " +queue.size());
        Node deleted = queue.dequeue();
        if(deleted != null)
        System.out.println("deleted element = " + deleted.getData());

        queue.enqueue(20);
        queue.enqueue(45);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(45);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(45);
        queue.enqueue(5);
        queue.traverse();
    }
}
