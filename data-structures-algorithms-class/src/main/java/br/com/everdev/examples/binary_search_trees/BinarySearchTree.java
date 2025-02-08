package br.com.everdev.examples.binary_search_trees;

public class BinarySearchTree {

    Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (this.root == null) {
            this.root = newNode;
            return true;
        }

        Node temp = this.root;

        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }

                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }

                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        Node temp = this.root;

        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return false;
    }

}
