public class Quicksort {


    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: ");
        printArray(arr);
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;


            quickSort(arr, low, i);
            quickSort(arr, i + 2, high);
        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

