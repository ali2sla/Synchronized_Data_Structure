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
    synchronized boolean put(Object obj) {
        if (amountData >= 100) {
            System.out.println("put() failed; please get() some");
            return false;
        }

       queue[putLocation] = obj;
        if (putLocation < 99) {
            putLocation = putLocation + 1;
            amountData = amountData + 1;
        } else {
            putLocation = 0;
        }
        return true;
    }

    synchronized Object get() {
        if (amountData >= 100) {
            System.out.println("get() failed; please put () some");
            return null;
        }

        int oldLocation = getLocation;
        if (getLocation < 99) {
            getLocation = getLocation + 1;
        } else {
            getLocation = 0;
        }
        return queue[oldLocation];
    }

    /* void run()  {
        Queue queue = new Queue();
        for (int i = 0; i < 100; i = i + 1) {
            queue.put(i);
        }

        for (int i = 0; i < 100; i = i + 1) {
            Object obj = queue.get();
            System.out.println(obj);
        }
    }*/
}
