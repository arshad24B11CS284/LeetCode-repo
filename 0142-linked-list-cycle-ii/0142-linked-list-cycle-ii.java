/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        if(fast==null || fast.next==null) return null;
        while(fast!=null){
            if(slow.next==null) return null;
            slow = slow.next;
            if(fast.next==null) return null;
            fast = fast.next.next;
            if(fast==null || fast.next==null) return null;
            if(slow==fast) break;
        }
        temp = head;
        while(temp!=slow){
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
        
    }
}