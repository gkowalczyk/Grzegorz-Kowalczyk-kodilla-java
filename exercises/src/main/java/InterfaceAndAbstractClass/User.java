package InterfaceAndAbstractClass;

public abstract class User {     // klasa ogólna abstrakcyjna, pomocnicza, klasa bazowa , nie tworzymy obiektów tej klasy

    private String userName;
    private String password;
    private String name;
    private String lastName;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    void login(String username, String password) {
        if (username.equals(this.userName) && password.equals(this.password)) {
            System.out.println("Logowanie użytkownika" + username + "/" + password);
        } else {
            System.out.println("Nieprawidłowe hasło lub/i login");
        }
    }

    void logout() {
        System.out.println("Wylogowywanie...");
    }

    abstract void sendMessage(String message);
}
