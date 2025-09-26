class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode  dummy = new ListNode(0,head);
        ListNode prev = dummy;
        ListNode lef;
        if(head==null || left == right) return head;
        for(int i =1;i<left;i++){
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode then = start.next;
        for(int i=0;i<right-left;i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then  = start.next;
        }
        return dummy.next;
    }
}