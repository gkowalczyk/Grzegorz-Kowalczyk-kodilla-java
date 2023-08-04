public class QuickSortingExampleAlgorithm1 {

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int indexSmallest = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                indexSmallest++;
                int temporary = arr[indexSmallest];
                arr[indexSmallest] = arr[j];
                arr[j] = temporary;
            }
        }
        int temporary = arr[indexSmallest + 1];
        arr[indexSmallest + 1] = arr[high];
        arr[high] = temporary;
        return indexSmallest + 1;
    }

    public void sort(int arr[], int low, int high) {

        if (high > low) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {-1, 7, -6, 9, 1, 5};
        int n = arr.length;
        QuickSortingExampleAlgorithm1 ob = new QuickSortingExampleAlgorithm1();
        ob.sort(arr, 0, n - 1);
        System.out.println();
        printArray(arr);
    }
}
