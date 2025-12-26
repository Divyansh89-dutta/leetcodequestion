class solution148 {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        // Step 1: Split into two halves
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; // cut the list

        // Step 2: Sort each half
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    // Merge two sorted lists
    private ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.val < b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        tail.next = (a != null) ? a : b;

        return dummy.next;
    }
}
public class q148 {
    static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        solution148 sol = new solution148();
        ListNode sortedHead = sol.sortList(head);

        // Print sorted list
        while (sortedHead != null) {
            System.out.print(sortedHead.val + " ");
            sortedHead = sortedHead.next;
        }
    }
}
