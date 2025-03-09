/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rev(ListNode slow) {
        ListNode prev = null;
        ListNode curr = slow;
        ListNode front = null;
        while (curr != null) {
             front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = rev(slow.next);
        ListNode p2 = slow.next;
        ListNode p1 = head;
        int max = 0;
        while (p2 != null) {
           int sum = p1.val + p2.val;
            if (sum > max) {
                max = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }
}