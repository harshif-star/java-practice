package day19;

public class Insertion{
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        int n = arr.length;

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        // Print sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}