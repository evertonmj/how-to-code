package br.com.everdev.data_structures.hash_tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static br.com.everdev.data_structures.utils.IOUtils.print;
import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class HashTableTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        printn("1 - Test hash table / 2 - Test duplicates inneficient / 3 - Test duplicates");
        String userInput = input.next();

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {4, 3, 9};

        switch (userInput) {
            case "1":
                testHashTable();
                break;
            case "2":
                print("Found: " + getDuplicatesInneficient(arr1, arr2));
                break;
            case "3":
                print("Found: " + getDuplicates(arr1, arr2));
                break;
            default:
                printn("Wrong option");
        }

    }

    private static void testHashTable() {
        HashTable hashTable = new HashTable();

        hashTable.set("bananas", 100);
        hashTable.set("apples", 50);
        hashTable.set("pineapples", 80);
        hashTable.set("mango", 50);
        hashTable.set("orange", 30);
        hashTable.set("lemon", 25);
        hashTable.set("strawberry", 26);
        hashTable.set("coconut", 122);

        hashTable.printTable();

        int valueGet = hashTable.get("orange");
        printn(valueGet);

        ArrayList<String> keys = hashTable.keys();
        printn("Keys: ");
        printn(keys);
    }

    public static boolean getDuplicatesInneficient(int[] arr1, int[] arr2) {
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean getDuplicates(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> table = new HashMap();

        for (int i : arr1) {
            table.put(i, true);
        }

        for (int j : arr2) {
            if (table.get(j) != null) {
                return true;
            }
        }

        return false;
    }
}
