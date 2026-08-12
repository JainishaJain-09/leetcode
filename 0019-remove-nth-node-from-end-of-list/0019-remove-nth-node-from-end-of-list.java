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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(n==count){
            return head.next;
        }
        int p=count-n;
        temp=head;
        int s=0;
        while(s<p-1){
            temp=temp.next;
            s++;
        }
        temp.next=temp.next.next;
        return head;
    }
}