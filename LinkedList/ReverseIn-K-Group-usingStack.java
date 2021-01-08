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
      Stack<ListNode> st = new Stack<>();
      ListNode curr = head;
      ListNode dummy = new ListNode(0);
      ListNode temp = dummy;
      while(curr!=null)
      {
          int count = 0;
          ListNode newcurr = curr;
          while(curr!=null && count<k)
          {
              ListNode topush = new ListNode(curr.val);
              st.push(topush);
              curr = curr.next;
              count++;
          }
          if(count==k)
          {
            while(st.size()>0)
          {
              temp.next = st.pop();
              temp = temp.next;
          }  
          }
          else{
              temp.next = newcurr;
          }
          
          
      }
      return dummy.next;
    }
}
