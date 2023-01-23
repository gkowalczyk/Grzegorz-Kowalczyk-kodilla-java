package InterfaceAndAbstractClass;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Professor extends User implements Employee {


    public Professor(String userName, String password) {
        super(userName, password);
    }

    void giveNotes() {
        System.out.println("Nadaje oceny");
    }

    void cancelClass() {
        System.out.println("Odwołuje zajęcia");
    }
    @Override
    void sendMessage(String message) {
        System.out.println("Wysyłanie wiadomości");
        System.out.println(message);
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

