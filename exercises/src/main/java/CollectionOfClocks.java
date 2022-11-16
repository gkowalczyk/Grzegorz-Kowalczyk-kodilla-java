import java.util.LinkedList;
import java.util.List;

public class CollectionOfClocks {

    //W metodzie ain klasy Program utwórz klasę Clock (z ang. zegar)
    // i kilka obiektów tej klasy.
    //
    //Utwórz również kolekcję typu LinkedList do przechowywania zegarów i
    // dodaj do tej kolekcji kilka utworzonych obiektów klasy Clock.
    //
    //Następnie – używając pętli for – przesuń w każdym zegarze godzinę o
    // jedną minutę do przodu.

    private int hour;
    private int minute;

    public CollectionOfClocks(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override

    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    void addMinuteMethod() {

        minute = minute + 1;
        if (minute == 60) {
            hour = hour + 1;
            minute = 0;
            if (hour == 24) {
                hour = 0;
            }
        }
    }

    public static void main(String[] args) {

        CollectionOfClocks collectionOfClocks = new CollectionOfClocks(12, 59);
        CollectionOfClocks collectionOfClocks1 = new CollectionOfClocks(13, 01);
        List<CollectionOfClocks> collectionOfClocksList = new LinkedList<>();
        collectionOfClocksList.add(collectionOfClocks);
        collectionOfClocksList.add(collectionOfClocks1);

        for (CollectionOfClocks clocks : collectionOfClocksList) {
            clocks.addMinuteMethod();

            System.out.println(clocks);
        }
    }
}
