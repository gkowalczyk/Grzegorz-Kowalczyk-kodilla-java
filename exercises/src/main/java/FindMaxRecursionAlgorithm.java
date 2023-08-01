public class FindMaxRecursionAlgorithm {

    public static int FindMaxInArray(int[] array, int index) {

        if (index >= array.length) {
            return 0;
        }
        int max = FindMaxInArray(array, index + 1);
        if (array[index] > max) {
            return array[index];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(FindMaxInArray(new int[]{1, 2, 3, 6, 9,99}, 0));
    }
}
