import java.util.ArrayList;
import java.util.List;

public class Concatenation {
    public static void main(String[] args) {

        //Używając konkatenacji, zapisz wszystkie nazwy po przecinku tak, aby otrzymać wynik:
        //
        //DELL, APPLE, SAMSUNG, SONY, ALCATEL


        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String temp = "";
        String decimal = ",";
        String last = companies.get(companies.size() - 1);

        for (int n = 0; n < companies.size(); n++) {

            temp += companies.get(n) + decimal;

            if (n == (companies.get(n).length() - 1))
                break;
        }
        temp += last;
        System.out.println(temp);
    }

}
