package InterfaceAndAbstractClass;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OfficeWorker extends User implements Employee {
    public OfficeWorker(String userName, String password) {
        super(userName, password);
    }

    @Override
    void sendMessage(String message) {

    }

    @Override
    public void takeVacation(int days) {
        System.out.println("Wniosek o urlop na :" + days + " dni ");
    }

    @Override
    public void takeSickLeave() {
        System.out.println("Informacja wysłana");
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Employee.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Employee.super.spliterator();
    }
}
