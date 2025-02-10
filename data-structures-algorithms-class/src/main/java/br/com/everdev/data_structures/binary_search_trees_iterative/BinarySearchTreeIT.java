package br.com.everdev.data_structures.binary_search_trees_iterative;

public class BinarySearchTreeIT {

    NodeIT root;

    public boolean insert(int value) {
        NodeIT newNodeIT = new NodeIT(value);

        if (this.root == null) {
            this.root = newNodeIT;
            return true;
        }

        NodeIT temp = this.root;

        while (true) {
            if (newNodeIT.value == temp.value) {
                return false;
            }

            if (newNodeIT.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNodeIT;
                    return true;
                }

                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNodeIT;
                    return true;
                }

                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        NodeIT temp = this.root;

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
