import java.util.HashMap;
import java.util.Map;

class Student { //klucz
    private String name;
    private String surname;
    private String pesel;

    public Student(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public boolean equals(Object o) {
        Student e = (Student) o;
        return (this.name == e.name) && (this.surname == e.surname) && (this.pesel == e.pesel);

    }

    public int hashCode() {
        return Integer.parseInt(pesel.substring(0, 5));
    }

    public String toString() {
        return name + " " + surname + " (" + pesel + ")";
    }
}

class SchoolGrades {//wartość

    double maths;
    double physics;
    double biology;

    public SchoolGrades(double maths, double physics, double biology) {
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

        Student student1 = new Student("Jan", "Kowalski", "88991112345");
        Student student2 = new Student("Adam", "Kowalski", "88991112345");
        Student student3 = new Student("Wojtek", "Kowalski", "88991112345");

        SchoolGrades schoolGrades1 = new SchoolGrades(4, 5, 2);
        SchoolGrades schoolGrades2 = new SchoolGrades(2, 2, 2);
        SchoolGrades schoolGrades3 = new SchoolGrades(6, 2, 1);

        Map<Student, SchoolGrades> schoolGradesMap = new HashMap<>();
        schoolGradesMap.put(student1, schoolGrades1);
        schoolGradesMap.put(student2, schoolGrades2);
        schoolGradesMap.put(student3, schoolGrades3);

        for (Map.Entry<Student, SchoolGrades> entry : schoolGradesMap.entrySet()) {
            System.out.println("Marks " + entry.getKey() + " equals: " + entry.getValue() + " average : " + entry.getValue().getAverage());

        }
    }
}


