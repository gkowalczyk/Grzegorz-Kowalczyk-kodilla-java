public class BinarySearchExample {

    public static int binaryResearch(int[] arr, int target) {

        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] == target) {
                mid = target;
                return mid;
            }
            if (arr[mid] < target) {
                min = arr[mid] + 1;
            } else {
                max = arr[mid] - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int target = -1;
        System.out.println(BinarySearchExample.binaryResearch(arr, target));
    }
}
