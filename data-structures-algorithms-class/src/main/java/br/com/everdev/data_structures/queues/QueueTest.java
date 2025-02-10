package br.com.everdev.data_structures.queues;

import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(2);
        queue.printQueue();

        queue.enqueue(3);
        queue.printQueue();

        queue.enqueue(33);
        queue.enqueue(211);
        queue.printQueue();

        Node item = queue.dequeue();
        printn("deq: "+item.value);
        queue.printQueue();

        item = queue.dequeue();
        printn("deq: "+item.value);
        queue.printQueue();
    }
}
