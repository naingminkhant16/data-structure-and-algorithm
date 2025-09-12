import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println("hello world");
        Integer[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        Integer[] nums = {0, 0, 0, 1};
//        Integer[] nums = {1, 1, 2};
        Integer k = removeDuplicates(numbers);
        System.out.println("K " + k);
        System.out.print("Numbers : ");
        System.out.println(Arrays.toString(numbers));
    }

    private static Integer removeDuplicates(Integer[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        Iterator<Integer> iterator = uniqueNumbers.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            numbers[i] = iterator.next();
            i++;
        }
        return uniqueNumbers.toArray().length;
    }
}
