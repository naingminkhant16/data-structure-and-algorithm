import java.util.Arrays;

// Big O notation Time Complexity - O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 11, 3};

        System.out.println("Initial Array : " + Arrays.toString(arr) + "\n");

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swap :" + arr[j] + " and " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swap = true;
                System.out.println("State (Inner Loop) " + (j + 1) + " : " + Arrays.toString(arr) + "\n");

            }
            System.out.println("State (Outer Loop) " + (i + 1) + " : " + Arrays.toString(arr) + "\n");

            if (!swap) break;
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}
