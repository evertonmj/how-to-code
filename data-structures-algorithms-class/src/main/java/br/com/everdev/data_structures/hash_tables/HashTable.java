package br.com.everdev.data_structures.hash_tables;

import java.util.ArrayList;

import static br.com.everdev.data_structures.utils.IOUtils.print;

public class HashTable {

    private Node[] dataMap;

    public HashTable() {
        int size = 7;
        dataMap = new Node[size];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            print(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    print("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
            print("\n");
        }
    }

    private int hash(String key) {
        int hash = 0;

        char[] keyChars = key.toCharArray();

        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }

        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);

        Node temp = dataMap[index];

        while(temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
        }

        return 0;
    }

    public ArrayList<String> keys() {
        ArrayList<String> allKeys = new ArrayList<>();

        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];

            while (temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }

        return allKeys;
    }
}
