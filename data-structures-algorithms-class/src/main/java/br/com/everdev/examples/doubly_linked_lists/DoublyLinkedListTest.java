package br.com.everdev.examples.doubly_linked_lists;

import static br.com.everdev.examples.utils.IOUtils.printn;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(1);

        list.printWithSeparator();

        list.append(2);
        list.append(3);

        list.printWithSeparator();

        list.removeLast();
        list.printWithSeparator();

        list.prepend(22);
        list.printWithSeparator();

        list.removeFirst();
        list.printWithSeparator();

        Node node = list.get(2);
        printn(node.value);

        list.set(0, 3);
        list.printWithSeparator();

        list.insert(2, 12);
        list.printWithSeparator();

        list.remove(0);
        list.printWithSeparator();
    }
}
