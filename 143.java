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
        ListNode fast = head,slow=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null,curr=slow,nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        ListNode rev = prev,first=head;
        while(rev.next !=null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = rev.next;
            first.next = rev;
            rev.next = tmp1;
            first=tmp1;
            rev=tmp2;
        }
    }
}