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
    public ListNode reverseList(ListNode head) {
          ListNode prev = null;
          ListNode curr = head;
          while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            //update 
            prev = curr;
            curr = next;
          }
          return prev;
    }
}
/*
class Solution {
    public ListNode reverseList(ListNode head) {

         Base case:
         1) empty list
         2) single node list
        if (head == null || head.next == null) {
            return head;
        }

         Reverse the rest of the list
        ListNode last = reverseList(head.next);

         Fix the current node
        head.next.next = head;  // make next node point back to current
        head.next = null;       // break original link

        // last is the new head
        return last;
    }
}
*/