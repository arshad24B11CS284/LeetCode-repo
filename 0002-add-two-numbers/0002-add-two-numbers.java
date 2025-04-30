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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dn = new ListNode(-1);
        ListNode cur = dn;
        int carry = 0 ,sum;
        while(t1!=null || t2!=null){
            sum = carry;
            if(t1!=null) {
            sum = sum + t1.val;
            }
            if(t2!=null) {
                sum = sum + t2.val;
            }

            ListNode nn = new ListNode(sum%10);
            carry = sum/10;

            cur.next = nn;
            cur = cur.next;

            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
        }

        if(carry == 1){
            ListNode nn = new ListNode(1);
            cur.next = nn;
        }
        return dn.next;
    }
}