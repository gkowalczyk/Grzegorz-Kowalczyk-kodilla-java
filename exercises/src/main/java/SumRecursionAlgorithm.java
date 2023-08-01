public class SumRecursionAlgorithm {

    public static int SumArray(int[] array, int index) {

        return index >= array.length ? 0 : array[index] + SumArray(array, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(SumArray(new int[]{1, 2, 3}, 0));
    }
}
