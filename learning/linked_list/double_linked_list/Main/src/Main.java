public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        // Insert from the beginning
        doubleLinkedList.unshift(3);
        doubleLinkedList.unshift(2);
        doubleLinkedList.unshift(1);
        // Insert at the end
        doubleLinkedList.push(4);
        doubleLinkedList.push(5);
        doubleLinkedList.push(7);
        // Insert after specific value
        doubleLinkedList.insert(6, 5);
        // Delete From the beginning
        doubleLinkedList.shift();
        // Delete at the end
        doubleLinkedList.pop();
        // Delete at the specific value
        doubleLinkedList.delete(3);
        // Print all node
        doubleLinkedList.printAll();
        // Get node by value
        Node<Integer> three = doubleLinkedList.get(4);
        if (three != null && three.next != null) System.out.println(three.next.val);
    }
}
