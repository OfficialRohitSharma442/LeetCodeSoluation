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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        //finding middle of linklist 
        ListNode mid = middle(head);
        //reversing of secoud half of linklis
        ListNode headsecound = reverse(mid);
        
        ListNode headfirst= head;
        //reordering of linklist 
        while(headfirst!=null && headsecound!=null){
            ListNode temp = headfirst.next;
            headfirst.next = headsecound;
            headfirst = temp;
            
            temp = headsecound.next;
            headsecound.next = headfirst;
            headsecound = temp;
        }
        //making tail null
        if(headfirst!=null){
            headfirst.next = null;
        }
    }
    
    //reverst linklist function 
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current!=null){
            ListNode n = current.next;
            current.next = prev;
            prev = current;
            current = n;
        }
        return prev;
    }
    //find middle Node linklist function using slow fast pointer
    public ListNode  middle(ListNode head){
        ListNode slow =head;
        ListNode fast =head;
       while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           slow = slow.next;
       }
        return slow;
    }
}