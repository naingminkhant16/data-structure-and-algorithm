public class LinkedList<T> {
    Node<T> head;

    /**
     * Insert at the beginning
     */
    public void unshift(T value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<T> newNode = new Node<>(value);
            // Set head as next of new node
            newNode.next = head;
            // Set new node as head
            head = newNode;
        }
    }

    /**
     * Insert at the end
     */
    public void push(T value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<T> temp = head.next;
            // Move to the end node of the list
            while (temp.next != null)
                temp = temp.next;
            // Add new node as next of last node
            temp.next = new Node<>(value);
        }
    }

    /**
     * Insert after specific value
     */
    public void insertAfter(T searchValue, T newValue) {
        // { searchNode -> newNode -> nextNode }
        Node<T> temp = head;
        while (temp != null) {
            if (temp.value == searchValue) {
                Node<T> newNode = new Node<>(newValue);
                // Set next of new node as the search's next node
                newNode.next = temp.next;
                // Set search's next node as the new node
                temp.next = newNode;
                break;
            } else {
                // Move to the next node if search value not found
                temp = temp.next;
            }
        }
    }

    /**
     * Delete at the beginning
     */
    public void shift() {
        head = head.next;
    }

    /**
     * Delete at the end
     */
    public void pop() {
        Node<T> temp = head;
        if (temp == null) return;
        // Move the temp to the node until before the last node
        while (temp.next.next != null)
            temp = temp.next;
        // Set temp node as last node of the list
        temp.next = null;
    }

    /**
     * Delete node with specific value
     */
    public void delete(T value) {
        Node<T> temp = head;
        // Found value at first node (head)
        if (temp != null && temp.value == value) {
            head = temp.next;
            return;
        }
        Node<T> prev = null;
        // Move node to next until value found
        while (temp != null && temp.value != value) {
            prev = temp;
            temp = temp.next;
        }
        // No value found in the list
        if (temp == null) return;
        // Found. remove the node we want to, set prev's next as the current's next node
        prev.next = temp.next;
    }

    /**
     * Reverse the list
     */
    public void reverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> nextTemp;
        while (current != null) {
            // store next node in temp
            nextTemp = current.next;
            // set current next as previous node
            // (first head node's next will be null as it will be last on reverse)
            current.next = prev;
            // make current node as previous
            prev = current;
            // set current to stored-next-node
            current = nextTemp;
        }
        head = prev;
    }

    /**
     * Search by value
     *
     * @return Node<T>
     */
    public Node<T> search(T value) {
        Node<T> temp = head;
        while (temp != null && temp.value != value)
            temp = temp.next;
        return temp;
    }

    /**
     * Print all nodes
     */
    public void printAll() {
        Node<T> all = head;
        System.out.print("{ ");
        while (all != null) {
            System.out.print(all.value + " ");
            all = all.next;
        }
        System.out.print("}");
    }
}
