
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = mid(head);
        ListNode head2 = mid.next;
        mid.next = null;
        head = sortList(head);
        head2 = sortList(head2);
        head = merge(head,head2);
        return head;
    }
    ListNode merge(ListNode head,ListNode head2)
    {
        ListNode t1=head,t2=head2,dummy = new ListNode(-1),dummyp = dummy;
        while(t1!=null && t2!=null)
        {
            if(t1.val<t2.val)
            {
                dummyp.next = t1;
                t1=t1.next; 
            }
            else
            {
                dummyp.next = t2;
                t2=t2.next;
            }
            dummyp = dummyp.next;
        }
        while(t1!=null){dummyp.next = t1;
                t1=t1.next;dummyp = dummyp.next;}
        while(t2!=null){
            dummyp.next = t2;
            t2=t2.next;
            dummyp = dummyp.next;
        }
        dummyp.next = null;
        return dummy.next;
    }
    ListNode mid(ListNode head)
    {
        ListNode slow = head,fast = head.next;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
