package Dijkstra_Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    public static void Dijkstra(Graph graph, Vertex vertexStart) {
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>(Comparator.comparing(Vertex::getId));

        for (Vertex vertex : graph.getVertices()) {
            if (vertex.equals(vertexStart)) {
                vertex.setWeight(0);
            } else {
                vertex.setWeight(Integer.MAX_VALUE);
            }
            priorityQueue.offer(vertex);
        }

        while (!priorityQueue.isEmpty()) {
            Vertex u = priorityQueue.poll();  // pobiera i usuwa
            for (Vertex v : graph.getNeighbours(u)) {
                int altDist = u.getWeight() + getEdgeWeight(graph, u, v);
                if (altDist < v.getWeight()) {
                    priorityQueue.remove(v);
                    v.setWeight(altDist);
                    priorityQueue.offer(v);
                }
            }
        }
        //print shortest distance
        int indexLast = graph.getVertices().size();
        System.out.println(("Shortest distances from node:" + vertexStart.getId() + " to " +
                graph.getVertices().get(indexLast - 1).getId()) + " = " +
                graph.getVertices().get(indexLast - 1).getWeight());
        for (Vertex v : graph.getVertices()) {
            System.out.println(v.getId() + " : " + v.getWeight());
        }
    }

    private static int getEdgeWeight(Graph graph, Vertex u, Vertex v) {
        for (Edge edge : graph.getEdges()) {
            if (edge.getSrc().equals(u) && edge.getDest().equals(v)) {
                return edge.getWeight();
            }
        }
        throw new IllegalArgumentException("Edge not found");
    }

    public static void main(String[] args) {
        Vertex A = new Vertex(0, Integer.MAX_VALUE);
        Vertex B = new Vertex(1, Integer.MAX_VALUE);
        Vertex C = new Vertex(2, Integer.MAX_VALUE);
        Vertex D = new Vertex(3, Integer.MAX_VALUE);
        Vertex E = new Vertex(4, Integer.MAX_VALUE);
        Vertex F = new Vertex(5, Integer.MAX_VALUE);
        List<Vertex> vertices = Arrays.asList(A, B, C, D, E, F);

        Edge e1 = new Edge(A, B, 3);
        Edge e3 = new Edge(A, C, 1);
        Edge e6 = new Edge(B, D, 8);
        Edge e5 = new Edge(C, E, 5);
        Edge e2 = new Edge(B, C, 4);
        Edge e4 = new Edge(E, F, 7);
        Edge e7 = new Edge(D, F, 1);
        Edge e8 = new Edge(D, E, 2);

        List<Edge> edges = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);
        Graph graph = new Graph(vertices, edges);
        Dijkstra(graph, A);
    }
}
