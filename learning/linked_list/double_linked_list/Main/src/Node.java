public class Node<T> {
    public T val;
    public Node<T> prev;
    public Node<T> next;

    public Node(T val) {
        this.val = val;
    }

    public Node(T val, Node<T> prev, Node<T> next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
