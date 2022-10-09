/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
     ListNode rev = reverse(head);  
      int sum = 0;
        
      int counter =0;
        while(rev!=null){
            if(rev.val==1){
                sum+=Math.pow(2,counter);
            }
            rev = rev.next;
            counter++;
        }
        return sum;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
            
        }
        return prev;
    }
}