import ShapeCollections.Circle;
import ShapeCollections.ShapeCollector;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
//Zadanie: Kolekcjonujemy figury (i testujemy to).
//Celem zadania jest przetestowanie klasy, którą musisz napisać, o nazwie – powiedzmy – ShapeCollections.ShapeCollector, przy następujących założeniach:
//
//Klasa ta przechowuje figury geometryczne w kolekcji ArrayList. Figury są następujące: kwadrat, koło, trójkąt (oczywiście użyj angielskich nazw klas).
//Utwórz interfejs ShapeCollections.Shape zawierający deklarację metod:
//metoda zwracająca nazwę figury,
//metoda zwracająca pole powierzchni tej figury.
//Klasy figur implementują interfejs ShapeCollections.Shape oraz posiadają wszystkie wymagane przez interfejs ShapeCollections.Shape metody.
//Klasa ShapeCollections.ShapeCollector ma cztery metody:
//dodającą figurę do kolekcji,
//usuwającą figurę z kolekcji,
//pobierającą z kolekcji figurę z pozycji n listy,
//zwracającą nazwy wszystkich figur w postaci jednego Stringa.
//Aby przygotować rozwiązanie zadania:
//
//W katalogu src/ain/java utwórz pakiet com.kodilla.testing.shape.
//W stworzonym pakiecie utwórz interfejs ShapeCollections.Shape, zawierający dwie metody: getShapeName() oraz getField().
//Utwórz klasy reprezentujące poszczególne figury – posiadające już właściwe implementacje metod interfejsu.
//Utwórz klasę ShapeCollections.ShapeCollector z metodami:
//addFigure(ShapeCollections.Shape shape),
//removeFigure(ShapeCollections.Shape shape),
//getFigure(int n) oraz
//showFigures().
//W katalogu src/test/java utwórz pakiet com.kodilla.testing.shape.
//Stwórz w tym pakiecie klasę testową (zbiór testów) ShapeCollectorTestSuite.

public class ShapeCollectorTestSuite {

   @Test
    void showFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 4.0);
        Circle circle1 = new Circle("circle1", 5.0);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(circle1);
        //When
        //Then
        Assertions.assertEquals("circle", shapeCollector.showFigures().get(0).shapeName());
    }

    @Test
    void getFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 4);
        shapeCollector.getShapeList().add(circle);
        //When
        String name = shapeCollector.getFigure(0).shapeName();
        double result = shapeCollector.getFigure(0).getArea();
        //Then
        Assertions.assertEquals(name, "circle");
        Assertions.assertEquals(Math.round(result), 50);
    }

    @Test
    void removeFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle", 4);
        shapeCollector.getShapeList().add(circle);
        //When
        //Then
        Assumptions.assumeTrue(shapeCollector.removeFigure(circle));
    }
}