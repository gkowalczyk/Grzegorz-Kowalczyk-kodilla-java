import java.util.HashMap;
import java.util.Map;

class Students { //klucz
    private String name;
    private String surname;
    private String pesel;

    public Students(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public boolean equals(Object o) {
        Students e = (Students) o;
        return (this.name == e.name) && (this.surname == e.surname) && (this.pesel == e.pesel);

    }

    public int hashCode() {
        return Integer.parseInt(pesel.substring(0, 5));
    }

    public String toString() {
        return name + " " + surname + " (" + pesel + ")";
    }
}

class SchoolGradess {//wartość

    double maths;
    double physics;
    double biology;

    public SchoolGradess(double maths, double physics, double biology) {
        this.maths = maths;
        this.physics = physics;
        this.biology = biology;
    }

    public double getAverage() {
        return (this.maths + this.physics + this.biology) / 3;
    }

    public String toString() {
        return maths + " , " + physics + " , " +
                biology;
    }
}

public class SchoolGradesMap {
    public static void main(String[] args) {

        Students student1 = new Students("Jan", "Kowalski", "88991112345");
        Students student2 = new Students("Adam", "Kowalski", "88991112345");
        Students student3 = new Students("Wojtek", "Kowalski", "88991112345");

        SchoolGrades schoolGrades1 = new SchoolGrades(4, 5, 2);
        SchoolGrades schoolGrades2 = new SchoolGrades(2, 2, 2);
        SchoolGrades schoolGrades3 = new SchoolGrades(6, 2, 1);

        Map<Students, SchoolGrades> schoolGradesMap = new HashMap<>();
        schoolGradesMap.put(student1, schoolGrades1);
        schoolGradesMap.put(student2, schoolGrades2);
        schoolGradesMap.put(student3, schoolGrades3);
         schoolGradesMap.entrySet().stream().forEach(x -> {
            x.getKey().toString();
            double avg =  schoolGradesMap.entrySet().stream().mapToDouble(y -> y.getValue().biology + x.getValue().maths + x.getValue().physics).sum();
             System.out.println(avg);
        });

        for (Map.Entry<Students, SchoolGrades> entry : schoolGradesMap.entrySet()) {
            System.out.println("Marks " + entry.getKey() + " equals: " + entry.getValue() + " average : " + entry.getValue().getAverage());

        }
    }
}


