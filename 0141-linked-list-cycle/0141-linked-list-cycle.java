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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(fast==null || fast.next==null) return false;
        while(fast!=null){
            if(slow.next==null) break;
            slow = slow.next;
            if(fast.next==null) break;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}