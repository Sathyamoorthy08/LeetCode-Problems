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
        if(head == null || head.next == null) return head;
        ListNode even=new ListNode(-1),odd=new ListNode(-1),p1 = even,p2=odd;
        int i=1;
        while(head != null)
        {
            if(i%2 == 0)
            {
                p1.next = head;
                p1 = p1.next;
            }
            else
            {
                p2.next = head;
                p2 = p2.next;
            }
            i++;
            head = head.next;
        }
        p2.next = even.next;
        p1.next = null;
        System.gc();
        return odd.next;
    }
}