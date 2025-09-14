public class App {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.unshift(1);
        linkedList.unshift(2);
        linkedList.unshift(3);
        linkedList.unshift(4);
        linkedList.unshift(5);
        linkedList.push(0);
        linkedList.unshift(7);

        linkedList.printAll();// { 7 5 4 3 2 1 0 }
        linkedList.insertAfter(7, 6);
        linkedList.printAll();// { 7 6 5 4 3 2 1 0 }

        linkedList.shift(); // Remove the start node
        linkedList.printAll(); // { 6 5 4 3 2 1 0 }

        linkedList.pop();// Remove at the end node
        linkedList.printAll();// { 6 5 4 3 2 1 }

        linkedList.delete(3);// Remove 3
        linkedList.printAll(); // { 6 5 4 2 1 }

        linkedList.reverse();
        linkedList.printAll(); // { 1 2 4 5 6 }

        Node<Integer> two = linkedList.search(22);
        if (two != null) System.out.println("Found " + two.value); // Found 2
        else System.out.println("Not found!"); // Not found!
    }
}
