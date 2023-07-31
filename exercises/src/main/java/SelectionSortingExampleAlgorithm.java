import java.util.ArrayList;
import java.util.List;

public class SelectionSortingExampleAlgorithm {

    public static int FindSmallest(List<Integer> arr) {

        int smallest = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
            }
        }
        return smallest;
    }

    public static List<Integer> IntegerList(List<Integer> arrayToSort) {

        List<Integer> sortedList = new ArrayList<>();
        List<Integer> toSortList = new ArrayList<>(arrayToSort);

        for (int n = 0; n < arrayToSort.size(); n++) {
            int smallest = FindSmallest(toSortList);
            sortedList.add(smallest);
            toSortList.removeIf(number -> number == smallest);
        }
        return sortedList;
    }

    public static void main(String[] args) {
        System.out.print(IntegerList(List.of(5, 3, 7, 1)));
    }
}
