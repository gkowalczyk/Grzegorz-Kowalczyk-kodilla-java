package InterfaceAndAbstractClass;

public class Student extends User{


    public Student(String userName, String password) {
        super(userName, password);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("Wysyłanie wiadomości");
        System.out.println(message);
    }

    void checkNotes() {
        System.out.println("Sprawdza oceny");
    }

    void skipClass() {
        System.out.println("Idę na wagary");
    }
}

