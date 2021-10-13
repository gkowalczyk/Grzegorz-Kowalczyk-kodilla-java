package com.kodilla.testing.shape;

public class Square implements Shape {

    private double r ;

    public Square(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getR());
        return (int) (temp ^ (temp >>> 32));
    }

    public String getShapeName() {
        return "Square";
    }
    public  double getField() {
        return r*r;
    }

}