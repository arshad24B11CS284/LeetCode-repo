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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tod = odd;
        ListNode tev = even;
        ListNode temp = head;
        while(temp!=null){
            tod.next = temp;
            tod = tod.next;
            temp = temp.next;

            tev.next = temp;
            tev = tev.next;
            if(tev==null) break;
            temp = temp.next; 
        } 
        odd = odd.next;
        even = even.next;
        tod.next =  even;
        return head;
    }
}