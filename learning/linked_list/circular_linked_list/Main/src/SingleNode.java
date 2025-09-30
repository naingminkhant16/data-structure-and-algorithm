public class SingleNode<T> {
    public T val;
    public SingleNode<T> next;

    public SingleNode(T val) {
        this.val = val;
    }

    public SingleNode(T val, SingleNode<T> next) {
        this.val = val;
        this.next = next;
    }
}
