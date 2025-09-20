public class Main {
    //    Constraints:
    //    The number of nodes in the list is in the range [0, 300].
    //    -100 <= Node.val <= 100
    //    The list is guaranteed to be sorted in ascending order.
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode solution = deleteDuplicates(head);
        while (solution != null) {
            System.out.print(solution.val);
            solution = solution.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }
}
