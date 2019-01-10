package org.sla;

public class Main {

    public static void main(String[] args) {

        int numberQueue = 3;
        for (int i = 0; i < numberQueue; i++) {
            Queue queue = new Queue();
            queue.run();
        }
    }
}
