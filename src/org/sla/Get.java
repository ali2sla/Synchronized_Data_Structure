package org.sla;

public class Get implements Runnable{
    Queue sharedQueue;

    Get(Queue queue) {
        sharedQueue = queue;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i = i + 1) {
            Object obj = sharedQueue.get();
            System.out.println(obj);
        }
    }
}
