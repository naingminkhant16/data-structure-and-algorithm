import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ArrayList<ListNode> visited = new ArrayList<>();

        while (head != null) {
            if (visited.contains(head)) return true;
            visited.add(head);
            head = head.next;
        }
        return false;
    }
}
