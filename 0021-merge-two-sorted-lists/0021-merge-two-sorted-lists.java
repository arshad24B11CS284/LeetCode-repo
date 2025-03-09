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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = new ListNode(0);
        ListNode temp = head;

        while(temp1!=null && temp2!=null){
               if(temp1.val<temp2.val){
                  ListNode t = new ListNode(temp1.val);
                  temp.next = t;
                  temp = t;
                  temp1 = temp1.next;
               } else {
                 ListNode t = new ListNode(temp2.val);
                  temp.next = t;
                  temp = t;
                  temp2 = temp2.next;
               }
        }
        if(temp1==null) temp.next = temp2;
        else temp.next = temp1;

        head = head.next;
        return head;


    }
}