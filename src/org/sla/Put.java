package org.sla;

public class Put implements Runnable {
    Queue sharedQueue;

    Put(Queue queue2) {
        sharedQueue = queue2;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100;  i = i + 1) {
            sharedQueue.put(i);
        }
    }
}
