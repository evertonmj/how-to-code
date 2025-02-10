package br.com.everdev.data_structures.stacks;

import static br.com.everdev.data_structures.utils.IOUtils.print;
import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        this.top = new Node(value);;
        this.height = 1;
    }

    public Node getTop() {
        return this.top;
    }

    public int getHeight() {
        return this.height;
    }

    public void printStack() {
        this.printStack("");
    }

    public void printStack(String sep) {
        if (this.height > 0) {
            Node current = this.top;

            print(current.value);
            current = current.next;

            while (current != null) {
                print("->");
                print(current.value);
                current = current.next;
            }
        } else {
            printn("Empty stack");
        }

        printn(sep);
    }

    public void push(int value) {
        Node newNode = new Node(value);

        if (this.height == 0) {
            this.top = newNode;
        } else {
            Node temp = this.top;
            this.top = newNode;
            newNode.next = temp;
        }

        this.height++;
    }

    public Node pop() {
        if (this.height == 0) {
            return null;
        }

        Node currentTop = this.top;
        this.top = currentTop.next;
        currentTop.next = null;

        this.height--;

        return currentTop;
    }

}
