package com.kodilla.testing.shape;
import com.kodilla.testing.forum.ForumComment;

import java.util.ArrayList;

public class ShapeCollector {
 // private Shape shape;
    private ArrayList<Shape> figureShape = new ArrayList<Shape>();
 // public ShapeCollector(Shape shape) {
//      this.shape = shape;
 // }

  //public Shape getShape() {
 //     return shape;
  //}
//Czy ten konstruktor jest tu potrzebny skoro mamy metodę addFigure??;

    public ArrayList<Shape> getFigureShape() {
        return figureShape;
    }

    public void addFigure (Shape shape) {
        figureShape.add(shape);
    }

    public boolean removeFigure (Shape shape) {
      boolean result = false;
      if (figureShape.contains(shape)){
      figureShape.remove(shape);
      result = true;}
     return result;
    }

    public  Shape getFigure(int n){
        Shape figure = null;
        if (n>= 0 && n < figureShape.size()) {
            figure = figureShape.get(n);
    }
        return figure;
    }

    public String showFigures() {

    String showFigure = null;
        for ( Shape showing : figureShape) {
           showFigure = showing.getShapeName();
        }
       return showFigure;
    }
}