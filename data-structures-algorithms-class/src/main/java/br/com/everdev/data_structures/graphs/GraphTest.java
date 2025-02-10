package br.com.everdev.data_structures.graphs;

import static br.com.everdev.data_structures.utils.IOUtils.printn;

public class GraphTest {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("camacari");
        graph.addVertex("salvador");
        graph.addVertex("dias davila");
        graph.addVertex("simoes filho");

        graph.addEdge("camacari", "salvador");
        graph.addEdge("camacari", "dias davila");
        graph.addEdge("camacari", "simoes filho");
        graph.addEdge("salvador", "simoes filho");

        printn("add edges");
        graph.print();

        graph.removeEdge("camacari", "simoes filho");
        printn("remove edges");
        graph.print();

        graph.removeVertex("salvador");
        printn("remove vertex");
        graph.print();
    }
}
