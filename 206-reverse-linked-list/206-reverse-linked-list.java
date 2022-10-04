
class Solution {
    public ListNode reverseList(ListNode head) {
   ListNode prev = null;
  ListNode  curr = head;
        while(curr!=null){
            ListNode right = curr.next;
            curr.next = prev;
         
            prev = curr;
              curr = right;
        }
           // prev = null;
            return prev;
    }

}
