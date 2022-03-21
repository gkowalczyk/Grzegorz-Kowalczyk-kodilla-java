package com.kodilla.spring.intro.shape;

public class Drawer {

    //public void doDrawing() {

      //  Shape shape;
     //  shape  = new Circle();
      // shape.draw();

      // shape = new Triangle();
      // shape.draw();

      // shape = new Square();
     //  shape.draw();

        final Shape shape;


    public Drawer(final Shape shape) {//Dependency Injection przez konsktruktor
        this.shape = shape;
    }
    public String doDrawing() {
        return shape.draw();
    }
}

