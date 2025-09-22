class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = new ListNode(0,head);
        ListNode prev = tmp;
        while(head !=null && head.next!=null){
            if(head.next !=null && head.val == head.next.val){
                while(head.next!=null && head.val == head.next.val){
                    head=head.next;
                }
                prev.next = head.next;
            }else{
                prev=prev.next;
            }
            head=head.next;
        }
        return tmp.next;
    }
}