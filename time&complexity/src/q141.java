class Solution141 {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
public class q141 {
    static void main(String[] args) {
// Creating linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Creating a cycle: last node points to node with value 2
        head.next.next.next.next = head.next;

        Solution141 sol = new Solution141();
        System.out.println(sol.hasCycle(head)); // true
    }
}
