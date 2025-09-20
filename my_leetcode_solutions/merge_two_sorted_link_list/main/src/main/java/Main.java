public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(
                1, new ListNode(2, new ListNode(4))
        );
        ListNode list2 = new ListNode(
                1, new ListNode(3, new ListNode(4))
        );
        // Expected Output: [1,1,2,3,4,4]

        ListNode mergedList = mergeTwoLists(list1, list2);
        while (mergedList != null) {
            System.out.print(mergedList.val);
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        // Set smallest for result head
        ListNode resultHead = new ListNode(-101);
        ListNode tail = resultHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;
        return resultHead.next; // next of -101
    }
}
