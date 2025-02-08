package br.com.everdev.examples.doubly_linked_lists;

import static br.com.everdev.examples.utils.IOUtils.printn;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public void print() {
        Node temp = this.head;
        while (temp != null) {
            printn(temp.value);
            temp = temp.next;
        }
    }

    public void printWithSeparator() {
        this.print();
        printn("--------------");
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }

        this.length++;
    }

    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }

        Node temp = this.tail;

        this.tail = this.tail.prev;
        this.tail.next = null;
        temp.prev = null;

        this.length--;

        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }

        this.length++;
    }

    public Node removeFirst() {
        if (this.length == 0) {
            return null;
        }

        Node temp = this.head;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
            temp.next = null;
        }

        this.length--;

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > this.length) {
            return null;
        }

        Node temp = this.head;

        if (index < this.length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = this.tail;
            for (int i = this.length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value) {
        Node node = this.get(index);

        if (node != null) {
            node.value = value;
            return true;
        }

        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > this.length) {
            return false;
        }

        if (index == 0) {
            this.prepend(value);
            return true;
        }

        if (index == this.length) {
            this.append(value);
            return true;
        }

        Node before = this.get(index - 1);
        Node after  = before.next;

        Node newNode = new Node(value);
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;

        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= this.length) {
            return false;
        }

        if (index == 0) {
            this.removeFirst();
            return true;
        }

        if (index == this.length - 1) {
            this.removeLast();
            return true;
        }

        Node current = this.get(index);
        Node before = current.prev;
        Node after = current.next;

        current.next = null;
        current.prev = null;

        before.next = after;
        after.prev = before;

        this.length--;

        return true;
    }
}
