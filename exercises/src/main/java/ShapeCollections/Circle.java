package ShapeCollections;

import java.awt.*;
import java.util.Objects;

public class Circle implements Shape {

    private final String name;
    private final  double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public double getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 && Objects.equals(name, circle.name);

    }

    @Override
    public String toString() {
        return "ShapeCollections.Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, r);
    }

    @Override
    public String shapeName() {

        return name;
    }

    @Override
    public double getArea() {
        return Math.PI*(r*r);
    }
}
