package br.com.everdev.examples.doubly_linked_lists;

public class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
