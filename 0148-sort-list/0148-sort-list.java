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
    void merge(int a[],int start,int mid,int end){
    int i=start;
    int j=mid+1;
    int[] b = new int[end-start+1];
    int k=0;
   
    while(i<=mid && j<=end){
        if(a[i]<a[j]){
            b[k++]=a[i++];
        } else {
            b[k++]=a[j++];
        }
    }
   
    while(i<=mid)b[k++] = a[i++];
    while(j<=end)b[k++] = a[j++];
    k=0;
    for(int l=start;l<=end;l++){
        a[l] = b[k++];
    }

    }

    void mergesort(int a[], int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;
        mergesort(a, start, mid);
        mergesort(a, mid + 1, end);
        merge(a, start, mid, end);

    }

    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        if(temp==null) return null;
        if(temp.next==null) return head;
        int cnt =0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        int[] arr = new int[cnt];
        temp = head;
        int i = 0;
        while(temp!=null){
           arr[i] = temp.val;
           i++;
           temp = temp.next;
        }
        mergesort(arr,0,cnt-1);
        temp = head;
        int k = 0;
        while(temp!=null){
           temp .val = arr[k];
           temp = temp.next;
           k++;
        }
        return head;

    }
}