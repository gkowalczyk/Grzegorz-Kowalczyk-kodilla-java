import java.util.HashMap;
import java.util.Map;

public class HashMapTrainee {

    private final Map<Integer, String> newHashMap(Map<Integer, String> hashMapToCopy, Map<Integer, String> hashMapFinal) {

        for (Map.Entry<Integer, String> entry : hashMapToCopy.entrySet()) {
            hashMapFinal.put(entry.getKey(), entry.getValue());
        }
        return hashMapFinal;
    }


    public static void main(String[] args) {


//Napisz program, który przekopiuje wszystkie wartości z HashMapy myFavoriteColours i myFriendsFavoriteColours do HashMapy ourFavoriteColours:

        Map<Integer, String> myFavoriteColours = new HashMap<>();
        Map<Integer, String> myFriendsFavoriteColours = new HashMap<>();

        myFavoriteColours.put(1, "Red");
        myFavoriteColours.put(2, "Green");
        myFavoriteColours.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColours);
        myFriendsFavoriteColours.put(4, "White");
        myFriendsFavoriteColours.put(5, "Blue");
        myFriendsFavoriteColours.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColours);

        Map<Integer, String> ourFavoriteColours = new HashMap<>();

        HashMapTrainee hashMapTrainee = new HashMapTrainee();
        hashMapTrainee.newHashMap(myFavoriteColours, ourFavoriteColours);
        hashMapTrainee.newHashMap(myFriendsFavoriteColours, ourFavoriteColours);
        System.out.println("Values in final map: " +ourFavoriteColours);
          }
}
