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
    public ListNode reverse(ListNode slow){
        ListNode prev = null;
        ListNode curr = slow;
        while(curr!=null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p = reverse(slow.next);
        ListNode p1 = head;
        while(p!=null){
           if(p.val!=p1.val){
            return false;
           }
           p = p.next;
           p1 = p1.next;
        }

        return true;

    }
}