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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        // if(head.next==null) return head;
        int flag = 0;
        while(temp!=null ){
            if(temp.val==val){
                if(temp==head){
                    head =head.next;
                }
                prev.next = prev.next.next;
                temp = temp.next;
            }else {
                temp =temp.next;
                prev = prev.next;
                flag =1;
            }
        }

        if(flag==0){
            prev = prev .next;
            return prev;
        }
        return head;
    }
}