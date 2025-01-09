// Simple Algorithm for finding lowest value (using loop through all data)
// Time Complexity O(n)
public class LowestValue {
    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 4, 11, 2};
        System.out.println("Lowest Value is : " + findLowest(arr));
    }

    private static int findLowest(int[] arr) {
        int lowest = arr[0];

        for (int i : arr) {
            if (i < lowest) lowest = i;
        }
        return lowest;
    }
}
