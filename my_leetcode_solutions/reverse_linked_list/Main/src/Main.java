public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(
                1,
                new ListNode(
                        2,
                        new ListNode(
                                3,
                                new ListNode(
                                        4,
                                        new ListNode(5)
                                )
                        )
                )
        );
        ListNode result = reverseList(head);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
