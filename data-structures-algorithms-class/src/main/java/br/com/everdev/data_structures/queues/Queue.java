package br.com.everdev.data_structures.queues;

import static br.com.everdev.data_structures.utils.IOUtils.print;
import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class Queue {
    private Node first;
    private Node last;
    int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        this.first = newNode;
        this.last = newNode;
        this.length = 1;
    }

    public Node getFirst() {
        return this.first;
    }

    public void printQueue() {
        if (this.length > 0) {
            Node current = this.first;
            Node last = this.last;

            printn("First: "+ this.first.value);
            printn("Last: "+ this.last.value);
            print(current.value);
            current = current.next;

            while (current != null) {
                print("->");
                print(current.value);
                current = current.next;
            }
        } else {
            printn("Empty queue");
        }

    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            Node temp = this.last;
            temp.next = newNode;
            this.last = newNode;
        }

        this.length++;
    }

    public Node dequeue() {
        if (this.length == 0) {
            return null;
        }

        Node temp = this.first;

        if (this.length == 1) {
            this.first = null;
            this.last = null;
        } else {
            this.first = temp.next;
            temp.next = null;
        }

        this.length--;
        return temp;
    }
}
