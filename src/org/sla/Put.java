package org.sla;

public class Put implements Runnable {
    Queue sharedQueue;

    Put(Queue queue2) {
        sharedQueue = queue2;
    }
    @Override
    public void run() {
        for (int i = 0; i < 300;  i = i + 1) {
            boolean putSuccess = sharedQueue.put(i);
            while (!putSuccess) {
                Thread.currentThread().yield();
                putSuccess = sharedQueue.put(i);
            }
        }
    }
}
