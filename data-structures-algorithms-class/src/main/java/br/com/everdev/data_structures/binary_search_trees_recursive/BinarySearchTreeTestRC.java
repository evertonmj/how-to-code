package br.com.everdev.data_structures.binary_search_trees_recursive;

import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class BinarySearchTreeTestRC {

    public static void main(String[] args) {
        BinarySearchTreeRC tree = new BinarySearchTreeRC();

        tree.rInsert(47);
        tree.rInsert(21);
        tree.rInsert(76);
        tree.rInsert(18);
        tree.rInsert(27);
        tree.rInsert(52);
        tree.rInsert(82);

        printn(tree.root.left.value);

        printn(tree.rContains(27));
    }
}
