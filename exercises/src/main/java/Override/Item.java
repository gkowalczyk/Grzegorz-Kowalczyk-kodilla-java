package Override;

public class Item {
//https://javappa.com/kurs-java/przeslanianie-metod
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public Object getName() {
        System.out.println("Super metoda w superklasie");
        return name;
    }
}

