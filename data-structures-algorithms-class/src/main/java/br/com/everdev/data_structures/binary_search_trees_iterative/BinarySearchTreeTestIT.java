package br.com.everdev.data_structures.binary_search_trees_iterative;

import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class BinarySearchTreeTestIT {

    public static void main(String[] args) {
        BinarySearchTreeIT tree = new BinarySearchTreeIT();

        tree.insert(20);
        tree.insert(15);
        tree.insert(5);
        tree.insert(60);


        printn(tree.root.left.value);

        printn(tree.contains(51));
    }
}
