public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int lenA = getLen(headA);
        int lenB = getLen(headB);
        while(lenA > lenB){
            headA = headA.next;
            lenA--;
        }
        while(lenB  > lenA){
            headB = headB.next;
            lenB--;
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    private int getLen(ListNode head){
        int len =0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}