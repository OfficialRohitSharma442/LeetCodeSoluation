public class Solution {
    public ListNode detectCycle(ListNode head) {
        //this is simple fast slow aproch to find cycle in linklist
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
            // if slow == fast break loop 
        }
        if (fast == null || fast.next == null) return null;
        //if any node is null it menes no cycle in linklist
        while (head != slow) {
            // after breaking we forword head whith slow if slow is equal to head then found the node where cycle begain
            head = head.next;
            slow = slow.next;
        }
        
        return slow;
    }
}