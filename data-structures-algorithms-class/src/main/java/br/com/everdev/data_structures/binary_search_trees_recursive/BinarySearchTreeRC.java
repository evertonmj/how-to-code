package br.com.everdev.data_structures.binary_search_trees_recursive;

public class BinarySearchTreeRC {

    NodeRC root;

    public boolean insert(int value) {
        NodeRC newNode = new NodeRC(value);

        if (this.root == null) {
            this.root = newNode;
            return true;
        }

        NodeRC temp = this.root;

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
        NodeRC temp = this.root;

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

    public boolean rContains(int value) {
        return rContains(this.root, value);
    }

    private boolean rContains(NodeRC currentNode, int value) {
        if (currentNode == null) {
            return false;
        }

        if (currentNode.value == value) {
            return true;
        }

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public void rInsert(int value) {
        if (this.root == null) {
            this.root = new NodeRC(value);
        }
        rInsert(this.root, value);
    }

    public NodeRC rInsert(NodeRC currentNode, int value) {
        if (currentNode == null) {
            return new NodeRC(value);
        }

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }

        return currentNode;
    }

}
