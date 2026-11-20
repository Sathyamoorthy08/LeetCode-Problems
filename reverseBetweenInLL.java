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
        if(head.next == null || left == right)return head;
        ListNode tem1 = head,tem2 = head,l1=new ListNode(-1,tem1),l2=new ListNode(-1,tem2);
        for(int i=1;i<left;i++)
        {
            l1=tem1;
            tem1 = tem1.next;
        }
        for(int i=1;i<right;i++)
        {
            tem2 = tem2.next;
            l2 = tem2.next;
        }
        tem2.next = null;
        l1.next = reverse(tem1);
        tem1 = l1;
        while(tem1.next != null)
        {
            tem1 = tem1.next;
        }
        tem1.next = l2;
        if(left==1)return l1.next;
        else return head;
    }
    ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null) return head;
        ListNode prev = null,cur = head,next= head.next;
        while(cur!=null)
        {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}