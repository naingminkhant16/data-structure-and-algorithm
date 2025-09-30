public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode
                (1, new ListNode(2,
                        new ListNode(6,
                                new ListNode(3,
                                        new ListNode(4,
                                                new ListNode(5,
                                                        new ListNode(6))))))
                );
        ListNode output = removeElements(head, 6);
        // Expected output : 1 2 3 4 5
        while (output != null) {
            System.out.print(output.val + " ");
            output = output.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode newHead = null;
        ListNode tail = null;

        while (head != null) {
            if (head.val != val) {
                if (newHead == null) {
                    newHead = new ListNode(head.val);
                    tail = newHead;
                } else {
                    tail.next = new ListNode(head.val);
                    tail = tail.next;
                }
            }
            head = head.next;
        }

        return newHead;
    }
}
