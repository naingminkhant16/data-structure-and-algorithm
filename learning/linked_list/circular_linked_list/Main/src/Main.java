public class Main {
    public static void main(String[] args) {
        SingleCircularLinkedList<Integer> singleCircularLinkedList = new SingleCircularLinkedList<>();
        // Insert at the start
        singleCircularLinkedList.unshift(2);
        singleCircularLinkedList.unshift(1);
        // Delete at the start
        singleCircularLinkedList.shift();
        singleCircularLinkedList.printAll();
    }
}
