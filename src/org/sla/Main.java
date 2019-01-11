package org.sla;

public class Main {

    public static void main(String[] args) {
        int numberQueue = 3;
        for (int o = 0; o < numberQueue; o++) {
            Queue queue = new Queue();

            Put put = new Put(queue);
            Get get = new Get(queue);

            Thread putting = new Thread(put);
            putting.start();

            Thread getting = new Thread(get);
            getting.start();
            //queue.run();
        }
    }
}
