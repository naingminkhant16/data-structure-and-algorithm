import java.util.Stack;

public class DepthFirstSearch {
    private static void dfsRecursive(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        for (Node child : root.children) {
            dfsRecursive(child);
        }
    }

    private static void dfsIterative(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.data + " ");
            for (int i = current.children.toArray().length - 1; i >= 0; i--) {
                stack.push(current.children.get(i));
            }
        }
    }

    public static void main(String[] args) {
         /*
                  1
               /     \
              2       3
            / | \   / | \
           4  5  6 7  8  9
        */
        Node root = new Node(1);

        Node node2 = new Node(2);
        node2.children.add(new Node(4));
        node2.children.add(new Node(5));
        node2.children.add(new Node(6));

        Node node3 = new Node(3);
        node3.children.add(new Node(7));
        node3.children.add(new Node(8));
        node3.children.add(new Node(9));

        root.children.add(node2);
        root.children.add(node3);

        System.out.print("DFS Recursive: ");
        dfsRecursive(root);

        System.out.println();

        System.out.print("DFS Iterative: ");
        dfsIterative(root);
    }
}
