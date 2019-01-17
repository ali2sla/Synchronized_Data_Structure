package org.sla;

public class Main {

    public static void main(String[] args) {
        int numberQueue = 1;
        for (int o = 0; o < numberQueue; o++) {
            Queue queue2 = new Queue();

            Put put = new Put(queue2);
            Get get = new Get(queue2);

            Thread putting = new Thread(put);
            putting.start();

            Thread getting = new Thread(get);
            getting.start();
            //queue.run();
        }
    }
}
