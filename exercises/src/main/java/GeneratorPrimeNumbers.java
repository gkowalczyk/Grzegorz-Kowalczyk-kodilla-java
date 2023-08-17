import java.util.ArrayList;
import java.util.List;

public class Sum {

    public List<Integer> integerList(int num) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if (numberIsPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }
    public boolean  numberIsPrime(int num) {
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                return false;
            }
        }
            return true;
        }


    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.integerList(100));
    }
}
