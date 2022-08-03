package ShapeCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ShapeCollector {

    private final List<Shape> shapeList = new ArrayList<>();

    @Override
    public String toString() {
        return "ShapeCollections.ShapeCollector{" +
                "shapeList=" + shapeList +
                '}';
    }

    public List<Shape> getShapeList() {
        return shapeList;

    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean optionalShape = shapeList.contains(shape);
        return optionalShape == true ? shapeList.remove(shape) : false;

    }

    public Shape getFigure(int n) {
        return Optional.ofNullable(shapeList.get(n)).orElseThrow(() -> new IndexOutOfBoundsException());
    }

    public List<Shape> showFigures() {
        return shapeList.stream()
                .collect(Collectors.toList());


    }
}



