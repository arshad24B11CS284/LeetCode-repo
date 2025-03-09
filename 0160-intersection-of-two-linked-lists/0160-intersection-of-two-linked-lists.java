/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int e = 0;
        int o = 0;
        while(temp1!=null){
            e++;
           temp1 = temp1.next;
        } 
        while(temp2!=null){
            o++;
            temp2 = temp2.next;
        }
        int t =0;
        if(e>o){
            t = e - o;
        } else {
            t = o - e;
        }
        temp1 = headA;
        temp2 = headB;
        for(int i=1;i<=t;i++){
            if(e>o){
                temp1 = temp1.next;
            } else {
                temp2 = temp2.next;
            }
        }
        while(temp1!=temp2){
            if(temp1==null) return null;
            temp1=temp1.next;
            if(temp2==null) return null;
            temp2=temp2.next;
        }
        return temp1;


    }
}