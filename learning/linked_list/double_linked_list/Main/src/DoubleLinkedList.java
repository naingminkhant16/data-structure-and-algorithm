public class DoubleLinkedList<T> {
    private Node<T> head;

    public void unshift(T val) {
        if (head != null) {
            head.prev = new Node<>(val, null, head);
            head = head.prev;
        } else {
            head = new Node<>(val);
        }
    }

    public void push(T val) {
        if (head != null) {
            Node<T> temp = head;
            // move to last node
            while (temp.next != null) temp = temp.next;
            temp.next = new Node<>(val, temp, null);
        } else {
            head = new Node<>(val);
        }
    }

    public void insert(T val, T after) {
        Node<T> temp = head;

        // find after node
        while (temp != null && !temp.val.equals(after)) temp = temp.next;

        if (temp != null) {
            Node<T> next = temp.next;
            temp.next = new Node<>(val, temp, next);
            if (next != null) next.prev = temp.next;
        }
    }

    public void shift() {
        if (head == null) return;
        head = head.next;
        head.prev = null;
    }

    public void pop() {
        Node<T> temp = head;
        while (temp.next != null) temp = temp.next;
        temp.prev.next = null;
    }

    public void delete(T val) {
        Node<T> toDeleteNode = head;

        while (toDeleteNode != null && !toDeleteNode.val.equals(val))
            toDeleteNode = toDeleteNode.next;

        if (toDeleteNode != null) {
            Node<T> prev = toDeleteNode.prev;
            Node<T> next = toDeleteNode.next;
            if (prev != null) prev.next = next;
            if (next != null) next.prev = prev;
        }
    }

    public Node<T> get(T val) {
        Node<T> foundNode = head;

        while (foundNode != null && !foundNode.val.equals(val))
            foundNode = foundNode.next;

        return foundNode;
    }

    public void printAll() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
