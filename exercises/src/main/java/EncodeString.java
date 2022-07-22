import java.util.Map;
import java.util.Objects;

public class EncodeString {

    public static void main(String[] args) {
        EncodeString encodeString = new EncodeString();
        // String charAr = "KOT";
        // String.valueOf(charAr.charAt(1));
        //System.out.println(String.valueOf(charAr.charAt(1)));
        System.out.println("RESULT:" + encodeString.encodeString("KOT"));

    }

    //Zapewne znasz klawiaturę w starych telefonach.
    // Np. taką w Nokii 3310 lub Sony Ericsson K750i:
    //
    //Zadanie rekrutacyjne online Java
    //W tych starych modelach, żeby napisać jakąś literę należało
    // kilka razy wcisnąć dany przycisk. I tak np. żeby uzyskać A
    // należało wcisnąć przycisk 2 jeden raz, a żeby uzyskać Z to
    // przycisk 9 cztery razy.
    //Dlatego np. słowo KOT oznaczało wciśnięcie klawiszy 556668.
    //
    //Twoim zadaniem jest napisanie metody, która dowolne słowo zamieni
    // właśnie na taki ciąg cyfr.



    Map<String, String> mapper = Map.of(
            "K", "55",
            "O", "666",
            "T", "8");


   public String encodeString(String text) {

       String start = "";

       if (Objects.nonNull(text)) {
           for (int n = 0; n < text.length(); n++) {

               String temporary = String.valueOf(text.charAt(n));
               start += mapper.getOrDefault(temporary, "");
           }
       }
       return start;
   }
}

