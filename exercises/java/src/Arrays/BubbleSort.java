package Arrays;

import java.util.Arrays;

// Big O notation Time Complexity - O(n^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 11, 3};
        int numOfOperation = 0;

        System.out.println("Initial Array : " + Arrays.toString(arr) + "\n");

        // (arr.length - 1) Ignore last index cuz biggest value will be put at last cell after one loop.
        // The largest value will be at the correct position after each iteration.
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;

            // (arr.length - 1 - i) Reduce the range of comparison as the last i elements are already sorted.
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Swap :" + arr[j] + " and " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
                System.out.println("State (Inner Loop) " + (j + 1) + " : " + Arrays.toString(arr) + "\n");
                numOfOperation++;
            }

            System.out.println("State (Outer Loop) " + (i + 1) + " : " + Arrays.toString(arr) + "\n");
            numOfOperation++;
            if (!swap) break;
        }

        System.out.println("Sorted Array : " + Arrays.toString(arr));
        System.out.println("Numbers Of Operation : " + numOfOperation);
    }
}
