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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null) return head;
        ListNode temph = head;
        ListNode temph1 = head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        for(int i=1;i<left;i++){
            temph = temph.next;
            prev = prev.next;
        }
        for(int i=1;i<right;i++){
            temph1 = temph1.next;
        }
         ListNode a = temph1.next;
        ListNode b = temph1.next;
        if(temph == head){
             while(temph!=b){
            ListNode front = temph.next;
            temph.next = a;
            a = temph;
            temph = front;
            }
           return a;
        }
        
        while(temph!=b){
            //if(temph.next==null) return head;
            ListNode front = temph.next;
            temph.next = a;
            a = temph;
            temph = front;
        }
        prev.next = a;
        return head;
    }
}