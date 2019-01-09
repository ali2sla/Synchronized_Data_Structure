package org.sla;

public class Queue {

    // Fields
    Object[] queue;
    Integer putLocation;
    Integer getLocation;

    // Constructor
    Queue() {
        queue = new Object[100];
        putLocation = 0;
        getLocation = 0;
    }

    // Method
    void put(Object obj)    {
        queue[putLocation] = obj;
        putLocation = putLocation + 1;
    }

    Object get() {
        getLocation = getLocation + 1;
        return queue[getLocation];
    }
}
