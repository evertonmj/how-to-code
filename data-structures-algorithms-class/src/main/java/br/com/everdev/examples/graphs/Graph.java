package br.com.everdev.examples.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static br.com.everdev.examples.utils.IOUtils.printn;

public class Graph {

    private HashMap<String, List<String>> adjList = new HashMap<>();

    public void print() {
        printn(this.adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }

        return false;
    }

    public boolean addEdge(String vertexA, String vertexB) {
        if (adjList.containsKey(vertexA) && adjList.containsKey(vertexB)) {
            adjList.get(vertexA).add(vertexB);
            adjList.get(vertexB).add(vertexA);

            return true;
        }

        return false;
    }

    public  boolean removeEdge(String vertexA, String vertexB) {
        if (adjList.containsKey(vertexA) && adjList.containsKey(vertexB)) {
            adjList.get(vertexA).remove(vertexB);
            adjList.get(vertexB).remove(vertexA);

            return true;
        }

        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adjList.containsKey(vertex)) {

            for (String vertexAssoc : adjList.get(vertex)) {
                adjList.get(vertexAssoc).remove(vertex);
            }

            adjList.remove(vertex);

            return true;
        }

        return false;
    }
}
