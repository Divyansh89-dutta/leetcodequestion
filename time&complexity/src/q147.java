import java.awt.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution147{
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        while(current != null){
            ListNode nextNode = current.next;
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;
            current = nextNode;
        }
        return dummy.next;
    }
}
public class q147 {
    static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        Solution147 sol = new Solution147();
        ListNode sortedHead = sol.insertionSortList(head);

        // Print sorted list
        while (sortedHead != null) {
            System.out.print(sortedHead.val + " ");
            sortedHead = sortedHead.next;
        }
    }
}
