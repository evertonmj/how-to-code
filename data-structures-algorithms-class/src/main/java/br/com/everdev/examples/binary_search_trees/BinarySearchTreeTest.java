package br.com.everdev.examples.binary_search_trees;

import static br.com.everdev.examples.utils.IOUtils.printn;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(20);
        tree.insert(15);
        tree.insert(5);
        tree.insert(60);


        printn(tree.root.left.value);

        printn(tree.contains(51));
    }
}
