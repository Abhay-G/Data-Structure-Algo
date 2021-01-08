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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null||head.next==null||k==1)
        {
              return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pointer = dummy;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        int size = 0;
        while(curr!=null)
        {
            size++;
            curr = curr.next;
        }
        curr = head;
        
         while(size>=k)
         {
              for(int i=0;i<k;i++)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
             ListNode tail = pointer.next;
             tail.next = curr;
             pointer.next = prev;
             pointer = tail;
             size = size-k;
         }
        return dummy.next;
    }
}
