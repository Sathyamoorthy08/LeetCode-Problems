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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        Stack<ListNode> s = new Stack<>();
        ListNode slow = head,fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        while(slow != null)
        {
            s.push(slow);
            slow = slow.next;
        }
        slow = head;
        while(!s.empty())
        {
            fast = slow.next;
            slow.next = s.pop();
            slow = slow.next;
            slow.next = fast;
            slow = slow.next;
        }
        fast.next = null;
    }
}