public class CountRecursionAlgorithm {

    public static int SumArray(int[] array, int count) {

        return count >= array.length ? 0 : 1 + SumArray(array, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(SumArray(new int[]{1, 2, 3, 6, 9}, 0));

    }
}
