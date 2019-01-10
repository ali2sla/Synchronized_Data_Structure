package org.sla;

public class Queue {

    // Fields
    Object[] queue;
    Integer putLocation;
    Integer getLocation;
    int amountData;

    // Constructor
    Queue() {
        queue = new Object[100];
        putLocation = 0;
        getLocation = 0;
        amountData = 0;
    }

    // Method
    void put(Object obj) {
        queue[putLocation] = obj;
        if (putLocation < 99) {
            putLocation = putLocation + 1;
            amountData = amountData + 1;
        } else {
            putLocation = 0;
        }
    }

    Object get() {
        int oldLocation = getLocation;
        if (getLocation < 99) {
            getLocation = getLocation + 1;
        } else {
            getLocation = 0;
        }
        return queue[oldLocation];
    }

    void run()  {
        Queue queue = new Queue();
        for (int i = 0; i < 100; i = i + 1) {
            queue.put(i);
        }

        for (int i = 0; i < 100; i = i + 1) {
            Object obj = queue.get();
            System.out.println(obj);
        }
    }
}
