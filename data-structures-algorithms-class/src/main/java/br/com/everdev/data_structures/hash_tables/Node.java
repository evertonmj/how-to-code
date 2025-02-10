package br.com.everdev.data_structures.hash_tables;

public class Node {
   int value;
   String key;
   Node next;

   public Node(String key, int value) {
       this.key = key;
       this.value = value;
   }

    public int getValue() {
        return this.value;
    }

    public String getKey() {
       return  this.key;
    }


}
