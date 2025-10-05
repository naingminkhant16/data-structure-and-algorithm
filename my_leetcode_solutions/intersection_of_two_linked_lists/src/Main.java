import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode intersectNode = new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(4))));

        ListNode headA = new ListNode(2, intersectNode);

        ListNode headB = intersectNode;

        long startTime = System.nanoTime();
        ListNode result = getIntersectionNode(headA, headB);
        long endTime = System.nanoTime();
        long durationNano = endTime - startTime;
        double durationSeconds = (double) durationNano / 1_000_000_000.0;
        System.out.println("O(n+m) Execution Seconds : " + durationSeconds);
        if (result != null) System.out.println(result.val);

        long startTime2 = System.nanoTime();
        ListNode result2 = getIntersectionNode2(headA, headB);
        long endTime2 = System.nanoTime();
        long durationNano2 = endTime2 - startTime2;
        double durationSeconds2 = (double) durationNano2 / 1_000_000_000.0;
        System.out.println("O(n^2) Execution Seconds : " + durationSeconds2);
        if (result2 != null) System.out.println(result2.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? headA : temp1.next;
            temp2 = (temp2 == null) ? headB : temp2.next;
        }

        return temp1;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != null) {
            ListNode temp = temp2;
            while (temp != null) {
                if (temp1.equals(temp)) return temp1;
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }
}
