import java.util.List;

public class AverageMarks {


    //Zadanie: średnia bez skrajnych ocen oraz lista obiektów Book
    //Zadanie składa się z dwóch części – jedna dotyczy ArrayList, a druga LinkedList. Obie części należy zrealizować wewnątrz edytora Kodilli. Oba rozwiązania powinny być w ramach jednego projektu.
    //
    //Część 1
    //
    //Napisz program przy użyciu listy ArrayList zawierającej kilkanaście ocen z przedmiotu Informatyka w liceum.
    //
    //Wypełnij listę przykładowymi ocenami.
    //
    //Następnie przy pomocy pętli for oblicz średnią ocenę ucznia (średnia arytmetyczna), ale w taki sposób, że pominięte zostaną skrajne oceny – JEDNA najmniejsza i JEDNA największa.
    //Oceny największą i najmniejszą należy odnaleźć. Przykładowo, dla ocen:
    //
    //3,3,4,4,4,5,5,5,6 – do obliczenia średniej wzięte zostaną oceny: 3,4,4,4,5,5,5
    //4,4,4,4,4,4,4 – do obliczenia średniej wzięte zostaną oceny: 4,4,4,4,4
    public static void main(String[] args) {

        List<Double> marks = List.of(2.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        double sum = 0;
        double mark = marks.get(0);
        double max = 0;
        double min = 0;

        for (double i = 0; i < marks.size(); i++) {
            min = marks.get((int) i);
            max = marks.get((int) i);
            if (mark > min) {

                mark = max;
            } else if (mark < max) {

                min = mark;
            }

            sum = sum + mark;

        }

        System.out.println("avg =" + (sum - max - min) / (marks.size() - 2));
        System.out.println("max=" + max);
        System.out.println("min=" + min);



        //alternatywa:


      /*  double maxValue = Collections.max(marks);
        double minValue = Collections.min(marks);

        System.out.println("Marks before removing max and min=" + marks.size());
        System.out.println("\n");

        double sum1 = 0;
        for (int n = 0; n < marks.size(); n++) {
            if (marks.get(n) == maxValue || marks.get(n) == minValue) {
                marks.remove(n);
            }


            System.out.println("Max mark=" + maxValue);
            System.out.println("Min mark=" + minValue);

            System.out.println("Marks after removing max and min=" + marks.size());
            System.out.println("\n");

            for (int n1 = 0; n1 < marks.size(); n1++) {

                sum1 += marks.get(n);


                System.out.println("New Gradebook Subject Informatics is:" + marks.get(n));
            }
            System.out.println("\n");
            double average = sum1 / (double) marks.size();

            System.out.println("Average without max && min mark=" + average);
        }*/
    }
}


