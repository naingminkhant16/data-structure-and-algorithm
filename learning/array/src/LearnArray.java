import java.util.Arrays;

public class LearnArray {
    public static void main(String[] args) {
        // Array insertion operation
//        insertion();
        // Array deletion operation
//        deletion();
        // Array searching operation
//        searching();
        // Array traversing operation
//        traversing();
        // Array update operation
        updating();
    }

    private static void insertion() {
        int[] data = new int[3];
        System.out.println("Array before insertion");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data [" + i + "] = " + data[i]);
        }

        System.out.println("Array after insertion");
        for (int i = 0; i < 3; i++) {
            data[i] = i + 3;
            System.out.println("Data [" + i + "] = " + data[i]);
        }
    }

    private static void deletion() {
        int[] data = new int[3];
        System.out.println("Array before deletion");
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 3;
            System.out.println("Data [" + i + "] = " + data[i]);
        }

        int n = data.length;
        for (int i = 1; i < n - 1; i++) {
            data[i] = data[i + 1];
            n -= 1;
        }
        System.out.println("Array after deletion");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data [" + i + "] = " + data[i]);
        }
    }

    private static void searching() {
        int[] data = new int[5];
        System.out.println("Array");
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 3;
            System.out.println("Data [" + i + "] = " + data[i]);
        }
        // Search 6
        System.out.println("Search 6");
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 6) {
                System.out.println("Found 6 at index " + i);
            }
        }
    }

    private static void traversing() {
        int[] LA = new int[5];
        System.out.println("The array elements are: ");
        for (int i = 0; i < 5; i++) {
            LA[i] = i + 2;
            System.out.println("LA[" + i + "] = " + LA[i]);
        }
    }

    private static void updating() {
        int[] data = {1, 2, 3, 4, 5};
        System.out.println("Array before updating");
        System.out.println(Arrays.toString(data));
        data[3] = 15;
        System.out.println("Array after updating");
        System.out.println(Arrays.toString(data));
    }
}
