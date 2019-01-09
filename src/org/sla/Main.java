package org.sla;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();

        for (int i = 0; i < 100; i = i + 1) {
            queue.put(i + 1);
        }

        for (int i = 0; i < 100; i = i + 1) {
            Object obj = queue.get();
            System.out.println(obj);
        }
    }
}
