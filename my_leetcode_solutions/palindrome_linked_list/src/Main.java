public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(1))
                )
        );

        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        StringBuilder original = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        ListNode temp = head;
        ListNode prev = null;

        // reverse given list
        while (temp != null) {
            original.append(temp.val);
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        while (prev != null) {
            reversed.append(prev.val);
            prev = prev.next;
        }

        return original.toString().contentEquals(reversed);
    }
}
