class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummy = new ListNode(0,head);
       ListNode tmp = dummy;
       while(tmp.next != null){
        if(tmp.next.val == val){
            tmp.next = tmp.next.next;
        }else{
            tmp = tmp.next;
        }
       }
       return dummy.next;
    }
}