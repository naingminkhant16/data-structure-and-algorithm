package Arrays;

import java.util.Arrays;

// Big O notation Time Complexity - O(n^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 5, 22, 11, 90, 12};

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // only swap if minIndex is changed
            if (minIndex != i) {
                // swap
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println("Selection Sorted Array : " + Arrays.toString(arr));
    }
}
