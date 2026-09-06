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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode dummyp = dummy;
        while(head !=null && head.next != null)
        {
            dummyp.next = head.next;
            dummyp = dummyp.next;
            ListNode tem = head.next.next;
            dummyp.next = head;
            dummyp = dummyp.next;
            head=tem;
        }
        if(head != null) {dummyp.next = head;dummyp = dummyp.next;}
        dummyp.next = null;
        return dummy.next;
    }
}