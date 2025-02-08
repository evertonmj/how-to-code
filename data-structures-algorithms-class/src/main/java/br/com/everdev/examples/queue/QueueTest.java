package br.com.everdev.examples.queue;

import static br.com.everdev.examples.utils.IOUtils.printn;

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
