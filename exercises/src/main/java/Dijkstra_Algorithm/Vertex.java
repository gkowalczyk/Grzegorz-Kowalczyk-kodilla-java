package Dijkstra_Algorithm;

import java.util.Objects;

public class Vertex {
//wierzchołki w grafie + wagi
    private int id;
    private int weight;

    public Vertex(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return id == vertex.id && weight == vertex.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight);
    }
}
