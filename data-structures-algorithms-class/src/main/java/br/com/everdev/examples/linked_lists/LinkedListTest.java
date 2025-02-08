package br.com.everdev.examples.linked_lists;


import java.util.Random;

import static br.com.everdev.examples.utils.IOUtils.printn;

public class LinkedListTest {
        static LinkedList list = new LinkedList(10);

    public static void main(String[] args) {
//
//        list.print();
//
//        list.printWithSeparator();
//        buildList(1);
//
//        list.print();
//
//        buildList(3);
//
//        list.printWithSeparator();
//
//        list.removeLast();
//        list.printWithSeparator();
//
//        list.prepend(2);
//
//        list.printWithSeparator();
//
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//
//        list.printWithSeparator();
//
//        buildList(3);
//
//        list.printWithSeparator();
//
//        Node node = list.get(1);
//        printn(node.value);
//
//        list.set(2, 3);
//
//        list.printWithSeparator();

        buildList(3);

//        list.printWithSeparator();printWithSeparator
//
//        Boolean res1 = list.insert(0, 11);
//        Boolean res2 = list.insert(3, 122);
//
//        list.printWithSeparator();
//
//        list.append(2);

        list.printWithSeparator();
        list.insert(2, 11);
        list.printWithSeparator();
        list.remove(2);

        list.printWithSeparator();

        list.remove(0);

        list.printWithSeparator();

        list.reverse();

        list.printWithSeparator();
    }

    public static LinkedList buildList(int size) {
        Random random = new Random();
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                list.append(random.nextInt(100));
            }
        } else {
            printn("Error! Size must be greater than zero");
        }

        return list;
    }

}
