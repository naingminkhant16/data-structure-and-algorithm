import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int data;
    public List<Node> children;

    public Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class BreathFirstSearch {
    private static void bsfTreeSearch(Node root, int goal) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        List<Integer> path = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            // remove front
            Node current = queue.poll();
            path.add(current.data);
            if (goal == current.data) {
                System.out.println("Goal Found : " + current.data);
                System.out.println("Path : " + path);
                return;
            }
            System.out.println(current.data);
            for (Node child : current.children) {
                queue.offer(child);
            }
        }
        System.out.println("Goal not found!");
    }

    public static void main(String[] args) {
        /*
                  1
               /     \
              2       3
            / | \   / | \
           4  5  6 7  8  9
        */
        Node rootNode = new Node(1);

        Node secondNode = new Node(2);
        secondNode.children.add(new Node(4));
        secondNode.children.add(new Node(5));
        secondNode.children.add(new Node(6));

        Node thirdNode = new Node(3);
        thirdNode.children.add(new Node(7));
        thirdNode.children.add(new Node(8));
        thirdNode.children.add(new Node(9));

        rootNode.children.add(secondNode);
        rootNode.children.add(thirdNode);

        bsfTreeSearch(rootNode, 2);
    }
}


