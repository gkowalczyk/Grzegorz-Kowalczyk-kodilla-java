package Dijkstra_Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    //graf + lista wierzchołków + lista krawędzi
    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph(List<Vertex> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public List<Vertex> getNeighbours(Vertex vertex) {
        List<Vertex> neighbours = new ArrayList<>();
        for (Edge edge : edges) { // Vertex src, Vertex dest, int weight
            if (edge.getSrc().equals(vertex)) {
                neighbours.add(edge.getDest());
            }
        }
        return neighbours;
    }
}

