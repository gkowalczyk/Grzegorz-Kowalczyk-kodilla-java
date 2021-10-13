package com.kodilla.testing.shape;

public class Circle implements Shape {
    double PI = Math.PI;
    private double r ;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getR());
        return (int) (temp ^ (temp >>> 32));
    }

    public String getShapeName() {
    return "Circle";
    }
   public  double getField() {
   return PI*(r*r);
    }

    @Override
    public String toString() {
        return "Circle";

    }
}
