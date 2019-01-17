package org.sla;

public class Get implements Runnable{
    Queue sharedQueue;

    Get(Queue queue2) {
        sharedQueue = queue2;
    }
    @Override
    public void run() {
        for (int i = 0; i < 300; i = i + 1) {
            Object obj = sharedQueue.get();


            while (obj == null) {
                Thread.currentThread().yield();
                obj = sharedQueue.get();
            }
            System.out.println(obj);

        }
    }
}
