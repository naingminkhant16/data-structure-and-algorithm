
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode result = swapPairs(head);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
        // Expected output : 214365
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode temp;
        ListNode newHead = null;
        ListNode newTail = null;

        while (current != null && current.next != null) {
            ListNode currentNode = current;
            ListNode next = currentNode.next;// next node

            temp = next.next; // upcoming node
            // switch node
            next.next = currentNode;
            currentNode.next = null;

            if (newHead == null) {
                newHead = next;
                newTail = newHead.next;
            } else if (newTail != null) {
                newTail.next = next;
                newTail = next.next;
            }
            
            current = temp;
        }

        if (newTail != null)
            newTail.next = current;
        else newHead = current;

        return newHead;
    }
}
