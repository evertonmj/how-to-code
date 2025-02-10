package br.com.everdev.data_structures.linked_lists;

import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public int getLength() {
        return this.length;
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
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }        
        this.length++;
    }

    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }

        Node temp = this.head;
        Node pre = this.head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        this.tail = pre;

        tail.next = null;

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
            newNode.next = this.head;
            this.head = newNode;
        }

        this.length++;
    }

    public Node removeFirst() {
        Node temp = null;
        if (this.length == 0) {
            return null;
        } else {
            temp = this.head;
            this.head = this.head.next;
            temp.next = null;
        }

        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }

        return temp;
    }

    public Node get(int index) {
        if (this.length == 0 || index >= this.length) {
            return null;
        }

        Node temp = this.head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    public boolean insert (int index, int val) {

        if (index < 0 || index > this.length) {
            return false;
        }

        if (index == 0) {
            this.prepend(val);
            return true;
        }

        if (index == this.length) {
            this.append(val);
            return true;
        }

        Node newNode = new Node(val);
        Node temp = this.get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;

        this.length++;

        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        if (index == 0) {
            return this.removeFirst();
        }

        if (index == this.length - 1) {
            return this.removeLast();
        }

        Node tempPrev = this.get(index - 1);
        Node temp = tempPrev.next;

        tempPrev.next = temp.next;
        temp.next = null;
        this.length--;

        return tempPrev;
    }

    public void reverse() {
        Node temp = this.head;
        Node prev = null;
        Node next = temp.next;

        this.head = this.tail;
        this.tail = temp;

        for (int i = 0; i < this.length; i++) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
    }
}