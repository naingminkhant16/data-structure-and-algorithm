public class SingleCircularLinkedList<T> {
    private SingleNode<T> head;

    public void unshift(T val) {
        if (head == null) {
            head = new SingleNode<>(val);
            head.next = head;
        } else {
            SingleNode<T> newNode = new SingleNode<>(val, head);
            SingleNode<T> tail = head;
            while (tail.next != head) tail = tail.next;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void shift() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            SingleNode<T> tail = head;
            while (tail.next != head) tail = tail.next;
            head = head.next;
            tail.next = head;
        }
    }

    public void printAll() {
        if (head == null) return;
        SingleNode<T> temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
    }
}
