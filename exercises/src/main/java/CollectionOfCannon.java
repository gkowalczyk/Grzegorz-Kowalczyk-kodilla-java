import java.util.ArrayList;
import java.util.List;

public class CollectionOfCannon {
    //Część 1
    //Napisz klasę Cannon (z ang. armata) z publicznym polem loaded (z ang. załadowana) typu boolean oraz metodą fire() (z ang. wystrzel), która sprawdza przed wystrzeleniem, czy kula znajduje się w armacie.
    //
    //Jeśli armata nie jest załadowana, zostanie wyświetlona informacja (System.out.println) o braku kuli w armacie, a następnie kula zostanie załadowana do tej armaty.
    //
    //Część 2
    //W metodzie ain klasy Program utwórz kolekcję typu LinkedList do przechowywania armat.
    //
    //Dodaj kilka obiektów klasy Cannon do kolekcji, a następnie – używając pętli for – załaduj wszystkie armaty.
private boolean loaded;

    public CollectionOfCannon(boolean loaded) {
        this.loaded = loaded;
    }

void islLoading() {

        boolean loaded = true;
    if (loaded ) {
        System.out.println("Fire!!!!!");
        loaded = false;
    }

    System.out.println("Loading......");
    loaded = true;

}
    public static void main(String[] args) {
CollectionOfCannon collectionOfCannon = new CollectionOfCannon(true);
        CollectionOfCannon collectionOfCannon1 = new CollectionOfCannon(true);
        CollectionOfCannon collectionOfCannon2 = new CollectionOfCannon(true);

        List<CollectionOfCannon> list = new ArrayList<>();
        list.add(collectionOfCannon);
        list.add(collectionOfCannon1);
        list.add(collectionOfCannon2);
        for (CollectionOfCannon cannon : list) {
            cannon.islLoading();

        }
    }

}
