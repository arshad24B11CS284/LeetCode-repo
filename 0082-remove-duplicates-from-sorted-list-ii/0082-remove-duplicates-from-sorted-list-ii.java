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
    public ListNode deleteDuplicates(ListNode head) {
          ListNode temp = head;
          ListNode prev = new ListNode(110);
          ListNode prev1 = new ListNode(110);
          prev1.next = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
                prev.val = temp.val;
                if(prev.val==temp.val && temp.next==null && temp==head) return null;
                if(prev.val==temp.val && temp.next==null ) {
                 prev1.next = null;
                 return head;
                }
            } else if(prev.val == temp.val ){
               temp.val = temp.next.val;
               temp.next = temp.next.next;
            }else {
                temp = temp.next;
                prev1 = prev1.next;
            }
        }
       return head;
    }
}