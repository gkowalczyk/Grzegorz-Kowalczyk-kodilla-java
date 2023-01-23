package InterfaceAndAbstractClass;

//https://www.youtube.com/watch?v=HhVJl1Z-6TA
public class Main {

    public static void main(String[] args) {
        Student student = new Student("student", "password");
        student.login("student", "password");


        Professor professor = new Professor("professor", "password");
        professor.takeVacation(2);
        professor.takeSickLeave();
        professor.cancelClass();
        professor.giveNotes();
        System.out.println(Employee.maxDaysVacation);

        Professor professor1 = new Professor("professor", "password");

        Employee[] employees = {professor, professor1};
        Employee.fireEmployees(employees);
    }
}

